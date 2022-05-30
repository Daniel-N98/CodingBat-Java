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

        assertEquals(sumDouble, 3);
        assertEquals(sumDouble2, 5);
        assertEquals(sumDouble3, 8);
    }

    @Test
    void diff21() {
        int diff21 = warmup1.diff21(19);
        int diff21_2 = warmup1.diff21(10);
        int diff21_3 = warmup1.diff21(21);
        int diff21_4 = warmup1.diff21(38);

        assertEquals(diff21, 2);
        assertEquals(diff21_2, 11);
        assertEquals(diff21_3, 0);
        assertEquals(diff21_4, 34);
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

        assertEquals(notString, expected);
        assertEquals(notString2, str2); // str2 should remain unchanged

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

        assertEquals(missingChar, expected);
        assertEquals(missingChar2, expected2);
        assertEquals(missingChar3, expected3);
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

        assertEquals(frontBack, expected);
        assertEquals(frontBack2, expected2);
        assertEquals(frontBack3, expected3);
    }
}