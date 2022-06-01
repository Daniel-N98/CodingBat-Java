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

    @Test
    void rotateLeft3() {
        int[] nums = {1, 2, 3};
        int[] nums2 = {7, 0, 0};
        int[] nums3 = {0, 4, 9};

        int[] rotateLeft3 = array1.rotateLeft3(nums);
        int[] rotateLeft3_2 = array1.rotateLeft3(nums2);
        int[] rotateLeft3_3 = array1.rotateLeft3(nums3);

        int[] expected = {2, 3, 1};
        int[] expected2 = {0, 0, 7};
        int[] expected3 = {4, 9, 0};

        assertArrayEquals(expected, rotateLeft3);
        assertArrayEquals(expected2, rotateLeft3_2);
        assertArrayEquals(expected3, rotateLeft3_3);
    }

    @Test
    void reverse3() {
        int[] nums = {1, 2, 3};
        int[] nums2 = {5, 11, 9};

        int[] reverse3 = array1.reverse3(nums);
        int[] reverse3_2 = array1.reverse3(nums2);

        int[] expected = {3, 2, 1};
        int[] expected2 = {9, 11, 5};

        assertArrayEquals(expected, reverse3);
        assertArrayEquals(expected2, reverse3_2);
    }
}