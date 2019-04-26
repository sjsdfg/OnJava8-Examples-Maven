// annotations/HashSetTest.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {java onjava.atunit.AtUnit
// build/classes/main/annotations/HashSetTest.class}
package annotations;

import onjava.atunit.Test;

import java.util.HashSet;

public class HashSetTest {
    HashSet<String> testObject = new HashSet<>();

    @Test
    void initialization() {
        assert testObject.isEmpty();
    }

    @Test
    void tContains() {
        testObject.add("one");
        assert testObject.contains("one");
    }

    @Test
    void tRemove() {
        testObject.add("one");
        testObject.remove("one");
        assert testObject.isEmpty();
    }
}
/* Output:
annotations.HashSetTest
  . initialization
  . tRemove
  . tContains
OK (3 tests)
*/
