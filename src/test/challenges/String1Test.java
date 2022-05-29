package challenges;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class String1Test {
    private static String1 string1;

    @BeforeAll
    static void beforeAll(){
        string1 = new String1();
    }

    @Test
    public void helloNameTest(){
        String name = "Bob";
        String greeting = string1.helloName(name);

        assertEquals(greeting, "Hello Bob!");
    }

    @Test
    void makeAbba() {
        String a = "Yo";
        String b = "Alice";
        String makeAbba = string1.makeAbba(a, b);

        assertEquals(makeAbba, a + b + b + a);
    }

    @Test
    void makeTags() {
        String tag = "cite";
        String word = "Yay";

        String makeTags = string1.makeTags(tag, word);
        String expected = "<" + tag + ">" + word + "</" + tag + ">";

        assertEquals(makeTags, expected);
    }
}