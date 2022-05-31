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

        assertEquals("Hello Bob!", greeting);
    }

    @Test
    void makeAbba() {
        String a = "Yo";
        String b = "Alice";

        String makeAbba = string1.makeAbba(a, b);

        assertEquals(a + b + b + a, makeAbba);
    }

    @Test
    void makeTags() {
        String tag = "cite";
        String word = "Yay";

        String makeTags = string1.makeTags(tag, word);
        String expected = "<" + tag + ">" + word + "</" + tag + ">";

        assertEquals(expected, makeTags);
    }

    @Test
    void makeOutWord() {
        String out = "<<>>";
        String word = "WooHoo";

        String makeOutWord = string1.makeOutWord(out, word);
        String expected = "<<WooHoo>>";

        assertEquals(expected, makeOutWord);
    }

    @Test
    void extraEnd() {
        String str = "Hello";

        String extraEnd = string1.extraEnd(str);
        String expected = "lololo"; // Last two characters of "Hello" repeated 3 times

        assertEquals(expected, extraEnd);
    }

    @Test
    void firstTwo() {
        String str = "abcdefg";

        String firstTwo = string1.firstTwo(str);
        String expected = "ab";

        assertEquals(expected, firstTwo);
    }

    @Test
    void firstHalf() {
        String str = "HelloThere";

        String firstHalf = string1.firstHalf(str);
        String expected = "Hello";

        assertEquals(expected, firstHalf);
    }

    @Test
    void withoutEnd() {
        String str = "Java";

        String withoutEnd = string1.withoutEnd(str);
        String expected = "av";

        assertEquals(expected, withoutEnd);
    }

    @Test
    void comboString() {
        String a = "aaa";
        String b = "b";

        String comboString = string1.comboString(a, b);
        String expected = "baaab";

        assertEquals(expected, comboString);
    }

    @Test
    void nonStart() {
        String a = "java";
        String b = "code";

        String nonStart = string1.nonStart(a, b);
        String expected = "avaode";

        assertEquals(expected, nonStart);
    }

    @Test
    void left2() {
        String str = "java";

        String left2 = string1.left2(str);
        String expected = "vaja";

        assertEquals(expected, left2);
    }

    @Test
    void right2() {
        String str = "Java";

        String right2 = string1.right2(str);
        String expected = "vaJa";

        assertEquals(expected, right2);
    }

    @Test
    void theEnd() {
        String str = "Hello";

        String frontTrue = string1.theEnd(str, true);
        String frontFalse = string1.theEnd(str, false);

        String expectedTrue = "H"; // First character of str
        String expectedFalse = "o"; // Last character of str

        assertEquals(expectedTrue, frontTrue);
        assertEquals(expectedFalse, frontFalse);
    }

    @Test
    void withouEnd() {
        String str = "Hello";
        String str2 = "ac"; // 2 character String should return an empty String

        String withouEnd = string1.withouEnd(str);
        String withouEnd2 = string1.withouEnd(str2);

        String expected = "ell";

        assertEquals(expected, withouEnd);
        assertEquals("", withouEnd2);
    }

    @Test
    void middleTwo() {
        String str = "Practice";

        String middleTwo = string1.middleTwo(str);
        String expected = "ct";

        assertEquals(expected, middleTwo);
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

        assertEquals(expected, nTwice);
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

        assertEquals(expected, twoChar);
        assertEquals(expected2, twoChar2);
    }

    @Test
    void middleThree() {
        String str = "Candy";
        String str2 = "Solving";

        String middleThree = string1.middleThree(str);
        String middleThree2 = string1.middleThree(str2);

        String expected = "and";
        String expected2 = "lvi";

        assertEquals(expected, middleThree);
        assertEquals(expected2, middleThree2);
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

        assertEquals(expected, asFirst);
        assertEquals(expected2, asFirst2);
        assertEquals(expected3, asFirst3);
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

        assertEquals(expected, lastChars);
        assertEquals(expected2, lastChars2);
        assertEquals(expected3, lastChars3);
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

        assertEquals(expected, conCat);
        assertEquals(expected2, conCat2);
    }

    @Test
    void lastTwo() {
        String str = "coding";
        String str2 = "a";

        String lastTwo = string1.lastTwo(str);
        String lastTwo2 = string1.lastTwo(str2);

        String expected = "codign";
        String expected2 = "a";

        assertEquals(expected, lastTwo);
        assertEquals(expected2, lastTwo2);
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

        assertEquals(expected, seeColor);
        assertEquals(expected2, seeColor2);
        assertEquals(expected3, seeColor3);


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

        assertEquals(expected, minCat);
        assertEquals(expected2, minCat2);
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

        assertEquals(expected, extraFront);
        assertEquals(expected2, extraFront2);
        assertEquals("", extraFront3);
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

        assertEquals(expected, without);
        assertEquals(expected2, without2);
        assertEquals("", without3);
        assertEquals("H", without4);

    }

    @Test
    void deFront() {
        String str = "Hello";
        String str2 = "away";
        String str3 = "ba";

        String deFront = string1.deFront(str);
        String deFront2 = string1.deFront(str2);
        String deFront3 = string1.deFront(str3);

        String expected = "llo";
        String expected2 = "aay";

        assertEquals(expected, deFront);
        assertEquals(expected2, deFront2);
        assertEquals("", deFront3);
    }

    @Test
    void startWord() {
        String str = "hippo";
        String word = "hi";
        String word2 = "xip";

        String startWord = string1.startWord(str, word);
        String startWord2 = string1.startWord(str, word2);

        String expected = "hi";
        String expected2 = "hip";

        assertEquals(expected, startWord);
        assertEquals(expected2, startWord2);
    }

    @Test
    void withoutX() {
        String str = "xHix";
        String str2 = "xHi";
        String str3 = "Hxix";

        String withoutX = string1.withoutX(str);
        String withoutX2 = string1.withoutX(str2);
        String withoutX3 = string1.withoutX(str3);

        String expected = "Hi"; // str & str2 should return the same value
        String expected2 = "Hxi";

        assertEquals(expected, withoutX);
        assertEquals(expected, withoutX2);
        assertEquals(expected2, withoutX3);

    }

    @Test
    void withoutX2() {
        String str = "xHi";
        String str2 = "xHi";
        String str3 = "Hexllo";

        String withoutX2 = string1.withoutX2(str);
        String withoutX3 = string1.withoutX2(str2);
        String withoutX4 = string1.withoutX2(str3);

        String expected = "Hi"; // str & str2 should return the same value
        String expected2 = "Hexllo";

        assertEquals(expected, withoutX2);
        assertEquals(expected, withoutX3);
        assertEquals(expected2, withoutX4);
    }
}