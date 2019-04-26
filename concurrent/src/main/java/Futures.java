// concurrent/Futures.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Futures {
    public static void main(String[] args)
            throws InterruptedException, ExecutionException {
        ExecutorService exec =
                Executors.newSingleThreadExecutor();
        Future<Integer> f =
                exec.submit(new CountingTask(99));
        System.out.println(f.get()); // [1]
        exec.shutdown();
    }
}
/* Output:
99 pool-1-thread-1 100
100
*/
