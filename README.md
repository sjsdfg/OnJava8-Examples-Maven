# OnJava8-Examples-Maven

this is the maven version of OnJava8-Examples https://github.com/BruceEckel/OnJava8-Examples

more easier to import

but not guarantee this is code is run ok.

because some code just show you the wrong way, like this:

```java
// generics/HijackedInterface.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {WillNotCompile}

class Cat
        extends ComparablePet implements Comparable<Cat> {
    // error: Comparable cannot be inherited with
    // different arguments: <Cat> and <ComparablePet>
    // class Cat
    // ^
    // 1 error

    public int compareTo(Cat arg) {
        return 0;
    }
}

```