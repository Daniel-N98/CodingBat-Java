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

    @Test
    void asFirst() {
        String str = "Hello";
        String str2 = "H";
        String str3 = "";

        String asFirst = string1.asFirst(str);
        String asFirst2 = string1.asFirst(str2);
        String asFirst3 = string1.asFirst(str3);

        String expected = "He";
        String expected2 = "H@";
        String expected3 = "@@";

        assertEquals(asFirst, expected);
        assertEquals(asFirst2, expected2);
        assertEquals(asFirst3, expected3);
    }

    @Test
    void lastChars() {
        String a = "last";
        String b = "chars";
        String a2 = "hi";
        String b2 = "";

        String lastChars = string1.lastChars(a, b); // Both have last characters
        String lastChars2 = string1.lastChars(a2, b2); // a2 has last character, b2 is empty String
        String lastChars3 = string1.lastChars(b2, b2); // both are empty Strings

        String expected = "ls";
        String expected2 = "h@";
        String expected3 = "@@";

        assertEquals(lastChars, expected);
        assertEquals(lastChars2, expected2);
        assertEquals(lastChars3, expected3);
    }

    @Test
    void conCat() {
        String a = "abc";
        String b = "cat";
        String b2 = "hat";

        String conCat = string1.conCat(a, b);
        String conCat2 = string1.conCat(a, b2);

        String expected = "abcat";
        String expected2 = "abchat";

        assertEquals(conCat, expected);
        assertEquals(conCat2, expected2);
    }

    @Test
    void lastTwo() {
        String str = "coding";
        String str2 = "a";

        String lastTwo = string1.lastTwo(str);
        String lastTwo2 = string1.lastTwo(str2);

        String expected = "codign";
        String expected2 = "a";

        assertEquals(lastTwo, expected);
        assertEquals(lastTwo2, expected2);
    }

    @Test
    void seeColor() {
        String str = "redxx";
        String str2 = "xxred";
        String str3 = "blueTimes";

        String seeColor = string1.seeColor(str);
        String seeColor2 = string1.seeColor(str2);
        String seeColor3 = string1.seeColor(str3);

        String expected = "red";
        String expected2 = "";
        String expected3 = "blue";

        assertEquals(seeColor, expected);
        assertEquals(seeColor2, expected2);
        assertEquals(seeColor3, expected3);


    }

    @Test
    void frontAgain() {
        String str = "edited";
        String str2 = "edit";
        String str3 = "";

        boolean frontAgain = string1.frontAgain(str);
        boolean frontAgain2 = string1.frontAgain(str2);
        boolean frontAgain3 = string1.frontAgain(str3);

        assertTrue(frontAgain);
        assertFalse(frontAgain2);
        assertFalse(frontAgain3);
    }

    @Test
    void minCat() {
        String a = "Hello";
        String b = "Hi";
        String a2 = "Hello";
        String b2 = "Java";

        String minCat = string1.minCat(a, b);
        String minCat2 = string1.minCat(a2, b2);

        String expected = "loHi";
        String expected2 = "elloJava";

        assertEquals(minCat, expected);
        assertEquals(minCat2, expected2);
    }

    @Test
    void extraFront() {
        String str = "Hello";
        String str2 = "ab";

        String extraFront = string1.extraFront(str);
        String extraFront2 = string1.extraFront(str2);
        String extraFront3 = string1.extraFront("");

        String expected = "HeHeHe";
        String expected2 = "ababab";

        assertEquals(extraFront, expected);
        assertEquals(extraFront2, expected2);
        assertEquals(extraFront3, "");
    }

    @Test
    void without2() {
        String str = "HelloHe";
        String str2 = "HelloHi";
        String str3 = "Hi";
        String str4 = "H";

        String without = string1.without2(str);
        String without2 = string1.without2(str2);
        String without3 = string1.without2(str3);
        String without4 = string1.without2(str4);

        String expected = "lloHe";
        String expected2 = "HelloHi";

        assertEquals(without, expected);
        assertEquals(without2, expected2);
        assertEquals(without3, "");
        assertEquals(without4, "H");

    }
}