package challenges;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Warmup1Test {

    private static Warmup1 warmup1;

    @BeforeAll
    static void beforeAll() {
        warmup1 = new Warmup1();
    }

    @Test
    void sleepIn() {

        boolean sleepIn = warmup1.sleepIn(false, false); // Not a week day
        boolean sleepIn2 = warmup1.sleepIn(true, false); // Is a week day
        boolean sleepIn3 = warmup1.sleepIn(false, true); // On vacation

        assertTrue(sleepIn);
        assertFalse(sleepIn2);
        assertTrue(sleepIn3);

    }

    @Test
    void monkeyTrouble() {
        boolean monkeyTrouble = warmup1.monkeyTrouble(true, true); // Both smiling
        boolean monkeyTrouble2 = warmup1.monkeyTrouble(false, false); // Both not smiling
        boolean monkeyTrouble3 = warmup1.monkeyTrouble(true, false); // One smiling, one not smiling

        assertTrue(monkeyTrouble);
        assertTrue(monkeyTrouble2);
        assertFalse(monkeyTrouble3);
    }

    @Test
    void sumDouble() {
        int sumDouble = warmup1.sumDouble(1, 2);
        int sumDouble2 = warmup1.sumDouble(3, 2);
        int sumDouble3 = warmup1.sumDouble(2, 2);

        assertEquals(3, sumDouble);
        assertEquals(5, sumDouble2);
        assertEquals(8, sumDouble3);
    }

    @Test
    void diff21() {
        int diff21 = warmup1.diff21(19);
        int diff21_2 = warmup1.diff21(10);
        int diff21_3 = warmup1.diff21(21);
        int diff21_4 = warmup1.diff21(38);

        assertEquals(2, diff21);
        assertEquals(11, diff21_2);
        assertEquals(0, diff21_3);
        assertEquals(34, diff21_4);
    }

    @Test
    void parrotTrouble() {
        boolean parrotTrouble = warmup1.parrotTrouble(true, 6);
        boolean parrotTrouble2 = warmup1.parrotTrouble(false, 7);
        boolean parrotTrouble3 = warmup1.parrotTrouble(true, 20);

        assertTrue(parrotTrouble);
        assertFalse(parrotTrouble2);
        assertFalse(parrotTrouble3);

    }

    @Test
    void makes10() {
        boolean makes10 = warmup1.makes10(9, 10);
        boolean makes10_2 = warmup1.makes10(9, 9);
        boolean makes10_3 = warmup1.makes10(1, 9);

        assertTrue(makes10);
        assertFalse(makes10_2);
        assertTrue(makes10_3);
    }

    @Test
    void nearHundred() {
        boolean nearHundred = warmup1.nearHundred(93);
        boolean nearHundred2 = warmup1.nearHundred(89);
        boolean nearHundred3 = warmup1.nearHundred(210);

        assertTrue(nearHundred);
        assertFalse(nearHundred2);
        assertTrue(nearHundred3);
    }

    @Test
    void posNeg() {
        int a = 1;
        int a2 = -5;

        int b = -1;
        int b2 = 6;

        boolean posNeg = warmup1.posNeg(a, b, false);
        boolean posNeg2 = warmup1.posNeg(b, a, false);
        boolean posNeg3 = warmup1.posNeg(a2, b2, true);

        assertTrue(posNeg);
        assertTrue(posNeg2);
        assertFalse(posNeg3);
    }


    @Test
    void notString() {
        String str = "candy";
        String str2 = "not bad";

        String notString = warmup1.notString(str);
        String notString2 = warmup1.notString(str2);

        String expected = "not candy";

        assertEquals(expected, notString);
        assertEquals(str2, notString2); // str2 should remain unchanged

    }

    @Test
    void missingChar() {
        String str = "kitten";

        String missingChar = warmup1.missingChar(str, 1);
        String missingChar2 = warmup1.missingChar(str, 0);
        String missingChar3 = warmup1.missingChar(str, 4);

        String expected = "ktten";
        String expected2 = "itten";
        String expected3 = "kittn";

        assertEquals(expected, missingChar);
        assertEquals(expected2, missingChar2);
        assertEquals(expected3, missingChar3);
    }

    @Test
    void frontBack() {
        String str = "code";
        String str2 = "a";
        String str3 = "ab";

        String frontBack = warmup1.frontBack(str);
        String frontBack2 = warmup1.frontBack(str2);
        String frontBack3 = warmup1.frontBack(str3);

        String expected = "eodc";
        String expected2 = "a";
        String expected3 = "ba";

        assertEquals(expected, frontBack);
        assertEquals(expected2, frontBack2);
        assertEquals(expected3, frontBack3);
    }

    @Test
    void front3() {
        String str = "Java";
        String str2 = "Chocolate";
        String str3 = "ab";

        String front3 = warmup1.front3(str);
        String front3_2 = warmup1.front3(str2);
        String front3_3 = warmup1.front3(str3);

        String expected = "JavJavJav";
        String expected2 = "ChoChoCho";
        String expected3 = "ababab";

        assertEquals(expected, front3);
        assertEquals(expected2, front3_2);
        assertEquals(expected3, front3_3);
    }

    @Test
    void backAround() {
        String str = "cat";
        String str2 = "Hello";
        String str3 = "a";

        String backAround = warmup1.backAround(str);
        String backAround2 = warmup1.backAround(str2);
        String backAround3 = warmup1.backAround(str3);

        String expected = "tcatt";
        String expected2 = "oHelloo";
        String expected3 = "aaa";

        assertEquals(expected, backAround);
        assertEquals(expected2, backAround2);
        assertEquals(expected3, backAround3);
    }

    @Test
    void or35() {
        boolean or35 = warmup1.or35(3);
        boolean or35_2 = warmup1.or35(10);
        boolean or35_3 = warmup1.or35(8);

        assertTrue(or35);
        assertTrue(or35_2);
        assertFalse(or35_3);
    }

    @Test
    void front22() {
        String str = "kitten";
        String str2 = "Ha";

        String front22 = warmup1.front22(str);
        String front22_2 = warmup1.front22(str2);

        String expected = "kikittenki";
        String expected2 = "HaHaHa";

        assertEquals(expected, front22);
        assertEquals(expected2, front22_2);
    }

    @Test
    void startHi() {
        String str = "hi there";
        String str2 = "Hello hi";

        boolean startHi = warmup1.startHi(str);
        boolean startHi2 = warmup1.startHi(str2);

        assertTrue(startHi);
        assertFalse(startHi2);
    }

    @Test
    void icyHot() {
        boolean icyHot = warmup1.icyHot(120, -1);
        boolean icyHot2 = warmup1.icyHot(2, 120);

        assertTrue(icyHot);
        assertFalse(icyHot2);
    }

    @Test
    void in1020() {
        boolean in1020 = warmup1.in1020(12, 99);
        boolean in1020_2 = warmup1.in1020(8, 99);

        assertTrue(in1020);
        assertFalse(in1020_2);
    }

    @Test
    void hasTeen() {
        boolean hasTeen = warmup1.hasTeen(13, 20, 10);
        boolean hasTeen2 = warmup1.hasTeen(11, 22, 24);

        assertTrue(hasTeen);
        assertFalse(hasTeen2);
    }

    @Test
    void loneTeen() {
        boolean loneTeen = warmup1.loneTeen(13, 99);
        boolean loneTeen2 = warmup1.loneTeen(13, 15);
        boolean loneTeen3 = warmup1.loneTeen(23, 14);

        assertTrue(loneTeen);
        assertFalse(loneTeen2);
        assertTrue(loneTeen3);
    }

    @Test
    void delDel() {
        String str = "adelbc";
        String str2 = "adelHello";
        String str3 = "adedbc";

        String delDel = warmup1.delDel(str);
        String delDel2 = warmup1.delDel(str2);
        String delDel3 = warmup1.delDel(str3);

        String expected = "abc";
        String expected2 = "aHello";

        assertEquals(expected, delDel);
        assertEquals(expected2, delDel2);
        assertEquals(str3, delDel3);
    }

    @Test
    void mixStart() {
        String str = "mix snacks";
        String str2 = "pix snacks";
        String str3 = "piz snacks";

        boolean mixStart = warmup1.mixStart(str);
        boolean mixStart2 = warmup1.mixStart(str2);
        boolean mixStart3 = warmup1.mixStart(str3);

        assertTrue(mixStart);
        assertTrue(mixStart2);
        assertFalse(mixStart3);
    }

    @Test
    void startOz() {
        String str = "ozymandias";
        String str2 = "bzoo";
        String str3 = "oxx";

        String startOz = warmup1.startOz(str);
        String startOz2 = warmup1.startOz(str2);
        String startOz3 = warmup1.startOz(str3);

        assertEquals("oz", startOz);
        assertEquals("z", startOz2);
        assertEquals("o", startOz3);
    }

    @Test
    void intMax() {
        int intMax = warmup1.intMax(1, 2, 3);
        int intMax2 = warmup1.intMax(-3, -1, -2);
        int intMax3 = warmup1.intMax(50, 20, 0);

        assertEquals(3, intMax);
        assertEquals(-1, intMax2);
        assertEquals(50, intMax3);
    }

    @Test
    void close10() {
        int close10 = warmup1.close10(8, 13);
        int close10_2 = warmup1.close10(14, 6);
        int close10_3 = warmup1.close10(11, 10);

        assertEquals(8, close10);
        assertEquals(0, close10_2);
        assertEquals(10, close10_3);
    }
}