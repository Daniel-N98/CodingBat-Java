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

    @Test
    void commonEnd() {
        int[] a = {1, 2, 3};
        int[] a2 = {1, 8, 1};

        int[] b = {7, 3};
        int[] b2 = {2, 6, 2};

        boolean commonEnd = array1.commonEnd(a, b);
        boolean commonEnd2 = array1.commonEnd(a2, b2);

        assertTrue(commonEnd);
        assertFalse(commonEnd2);
    }

    @Test
    void sum3() {
        int[] nums = {1, 2, 3};
        int[] nums2 = {5, 11, 2};
        int[] nums3 = {0, 6, -4};

        int sum3 = array1.sum3(nums);
        int sum3_2 = array1.sum3(nums2);
        int sum3_3 = array1.sum3(nums3);

        assertEquals(6, sum3);
        assertEquals(18, sum3_2);
        assertEquals(2, sum3_3);
    }
}