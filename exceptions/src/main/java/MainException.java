// exceptions/MainException.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MainException {
    // Pass exceptions to the console:
    public static void
    main(String[] args) throws Exception {
        // Open the file:
        List<String> lines = Files.readAllLines(
                Paths.get("MainException.java"));
        // Use the file ...
    }
}
