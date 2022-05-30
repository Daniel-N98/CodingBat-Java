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
}