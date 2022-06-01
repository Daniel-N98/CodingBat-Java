package challenges;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array1Test {

    private static Array1 array1;

    @BeforeAll
    static void beforeAll() {
        array1 = new Array1();
    }

    @Test
    void firstLast6(){
        int[] nums = {1, 2, 6};
        int[] nums2 = {13, 6, 1, 2, 3};
        int[] nums3 = {6};

        boolean firstLast6 = array1.firstLast6(nums);
        boolean firstLast6_2 = array1.firstLast6(nums2);
        boolean firstLast6_3 = array1.firstLast6(nums3);

        assertTrue(firstLast6);
        assertFalse(firstLast6_2);
        assertTrue(firstLast6_3);
    }

    @Test
    void sameFirstLast() {
        int[] nums = {1, 2, 3};
        int[] nums2 = {1, 2, 1};
        int[] nums3 = {1};

        boolean sameFirstLast = array1.sameFirstLast(nums);
        boolean sameFirstLast2 = array1.sameFirstLast(nums2);
        boolean sameFirstLast3 = array1.sameFirstLast(nums3);

        assertFalse(sameFirstLast);
        assertTrue(sameFirstLast2);
        assertTrue(sameFirstLast3);
    }

    @Test
    void makePi() {
        int[] pi = {3, 1, 4};

        int[] makePi = array1.makePi();

        assertArrayEquals(pi, makePi);
    }
}