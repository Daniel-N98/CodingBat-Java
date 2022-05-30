package challenges;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        String str2 = "ac"; // 2 character String should return an empty String

        String withouEnd = string1.withouEnd(str);
        String withouEnd2 = string1.withouEnd(str2);

        String expected = "ell";

        assertEquals(withouEnd, expected);
        assertEquals(withouEnd2, "");
    }

    @Test
    void middleTwo() {
        String str = "Practice";

        String middleTwo = string1.middleTwo(str);
        String expected = "ct";

        assertEquals(middleTwo, expected);
    }

    @Test
    void endsLy() {
        String str = "oddly";
        String str2 = "oddy";

        boolean endsLy = string1.endsLy(str);
        boolean endsLy2 = string1.endsLy(str2);

        assertTrue(endsLy);
        assertFalse(endsLy2);
    }

    @Test
    void nTwice() {
        String str = "Chocolate";
        int n = 3;

        String nTwice = string1.nTwice(str, n);
        String expected = "Choate";

        assertEquals(nTwice, expected);
    }

    @Test
    void twoChar() {
        String str = "java";
        int index = 2;
        int index2 = 3;

        String twoChar = string1.twoChar(str, index);
        String twoChar2 = string1.twoChar(str, index2);

        String expected = "va";
        String expected2 = "ja";

        assertEquals(twoChar, expected);
        assertEquals(twoChar2, expected2);
    }

    @Test
    void middleThree() {
        String str = "Candy";
        String str2 = "Solving";

        String middleThree = string1.middleThree(str);
        String middleThree2 = string1.middleThree(str2);

        String expected = "and";
        String expected2 = "lvi";

        assertEquals(middleThree, expected);
        assertEquals(middleThree2, expected2);
    }

    @Test
    void hasBad() {
        String str = "badxx";
        String str2 = "xbadxx";
        String str3 = "xxbadxx";

        boolean hasBad = string1.hasBad(str);
        boolean hasBad2 = string1.hasBad(str2);
        boolean hasBad3 = string1.hasBad(str3);

        assertTrue(hasBad);
        assertTrue(hasBad2);
        assertFalse(hasBad3);
    }
}