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
}