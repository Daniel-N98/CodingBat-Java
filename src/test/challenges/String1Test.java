package challenges;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class String1Test {
    private static String1 string1;

    @BeforeAll
    static void beforeAll() {
        string1 = new String1();
    }

    @Test
    void helloName() {
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

    @Test
    void makeOutWord() {
        String out = "<<>>";
        String word = "WooHoo";

        String makeOutWord = string1.makeOutWord(out, word);
        String expected = "<<WooHoo>>";

        assertEquals(makeOutWord, expected);
    }

    @Test
    void extraEnd() {
        String str = "Hello";

        String extraEnd = string1.extraEnd(str);
        String expected = "lololo"; // Last two characters of "Hello" repeated 3 times

        assertEquals(extraEnd, expected);
    }

    @Test
    void firstTwo() {
        String str = "abcdefg";

        String firstTwo = string1.firstTwo(str);
        String expected = "ab";

        assertEquals(firstTwo, expected);
    }

    @Test
    void firstHalf() {
        String str = "HelloThere";

        String firstHalf = string1.firstHalf(str);
        String expected = "Hello";

        assertEquals(firstHalf, expected);
    }

    @Test
    void withoutEnd() {
        String str = "Java";

        String withoutEnd = string1.withoutEnd(str);
        String expected = "av";

        assertEquals(withoutEnd, expected);
    }

    @Test
    void comboString() {
        String a = "aaa";
        String b = "b";

        String comboString = string1.comboString(a, b);
        String expected = "baaab";

        assertEquals(comboString, expected);
    }

    @Test
    void nonStart() {
        String a = "java";
        String b = "code";

        String nonStart = string1.nonStart(a, b);
        String expected = "avaode";

        assertEquals(nonStart, expected);
    }

    @Test
    void left2() {
        String str = "java";

        String left2 = string1.left2(str);
        String expected = "vaja";

        assertEquals(left2, expected);
    }

    @Test
    void right2() {
        String str = "Java";

        String right2 = string1.right2(str);
        String expected = "vaJa";

        assertEquals(right2, expected);
    }

    @Test
    void theEnd() {
        String str = "Hello";

        String frontTrue = string1.theEnd(str, true);
        String frontFalse = string1.theEnd(str, false);

        String expectedTrue = "H"; // First character of str
        String expectedFalse = "o"; // Last character of str

        assertEquals(frontTrue, expectedTrue);
        assertEquals(frontFalse, expectedFalse);
    }

    @Test
    void withouEnd() {
        String str = "Hello";

        String withouEnd = string1.withouEnd(str);
        String expected = "ell";

        assertEquals(withouEnd, expected);

        String str2 = "ac"; // 2 character String should return an empty String

        String withouEnd2 = string1.withouEnd(str2);

        assertEquals(withouEnd2, "");
    }

    @Test
    void middleTwo() {
        String str = "Practice";

        String middleTwo = string1.middleTwo(str);
        String expected = "ct";

        assertEquals(middleTwo, expected);
    }
}