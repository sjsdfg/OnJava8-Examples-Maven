// concurrent/ParallelStreamPuzzle2.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamPuzzle2 {
    public static final Deque<String> trace =
            new ConcurrentLinkedDeque<>();

    static class
    IntGenerator implements Supplier<Integer> {
        private AtomicInteger current =
                new AtomicInteger();

        public Integer get() {
            trace.add(current.get() + ": " +
                    Thread.currentThread().getName());
            return current.getAndIncrement();
        }
    }

    public static void
    main(String[] args) throws Exception {
        List<Integer> x =
                Stream.generate(new IntGenerator())
                        .limit(10)
                        .parallel()
                        .collect(Collectors.toList());
        System.out.println(x);
        Files.write(Paths.get("PSP2.txt"), trace);
    }
}
/* Output:
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
*/
