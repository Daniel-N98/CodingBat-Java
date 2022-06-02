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

    @Test
    void maxEnd3() {
        int[] nums = {1, 2, 3};
        int[] nums2 = {11, 5, 9};
        int[] nums3 = {2, 11, 3};

        int[] maxEnd3 = array1.maxEnd3(nums);
        int[] maxEnd3_2 = array1.maxEnd3(nums2);
        int[] maxEnd3_3 = array1.maxEnd3(nums3);

        int[] expected = {3, 3, 3};
        int[] expected2 = {11, 11, 11};
        int[] expected3 = {3, 3, 3};

        assertArrayEquals(expected, maxEnd3);
        assertArrayEquals(expected2, maxEnd3_2);
        assertArrayEquals(expected3, maxEnd3_3);
    }

    @Test
    void sum2() {
        int[] nums = {1, 2, 3};
        int[] nums2 = {1, 1};
        int[] nums3 = {4, 5, 6, 7 ,8 };

        int sum2 = array1.sum2(nums);
        int sum2_2 = array1.sum2(nums2);
        int sum2_3 = array1.sum2(nums3);

        assertEquals(3, sum2);
        assertEquals(2, sum2_2);
        assertEquals(9, sum2_3);
    }

    @Test
    void middleWay() {
        int[] a = {1, 2, 3};
        int[] a2 = {7, 7, 7};

        int[] b = {4, 5, 6};
        int[] b2 = {2, 8, 9};

        int[] middleWay = array1.middleWay(a, b);
        int[] middleWay2 = array1.middleWay(a2, b2);

        int[] expected = {2, 5};
        int[] expected2 = {7, 8};

        assertArrayEquals(expected, middleWay);
        assertArrayEquals(expected2, middleWay2);
    }

    @Test
    void makeEnds() {
        int[] nums = {1, 2, 3};
        int[] nums2 = {7, 4, 6, 2};

        int[] makeEnds = array1.makeEnds(nums);
        int[] makeEnds2 = array1.makeEnds(nums2);

        int[] expected = {1, 3};
        int[] expected2 = {7, 2};

        assertArrayEquals(makeEnds, expected);
        assertArrayEquals(makeEnds2, expected2);
    }

    @Test
    void has23() {
        int[] nums = {2, 5};
        int[] nums2 = {7, 7};
        int[] nums3 = {4, 3};

        boolean has23 = array1.has23(nums);
        boolean has23_2 = array1.has23(nums2);
        boolean has23_3 = array1.has23(nums3);

        assertTrue(has23);
        assertFalse(has23_2);
        assertTrue(has23_3);
    }

    @Test
    void no23() {
        int[] nums = {4, 5};
        int[] nums2 = {3, 3};

        boolean no23 = array1.no23(nums);
        boolean no23_2 = array1.no23(nums2);

        assertTrue(no23);
        assertFalse(no23_2);
    }
}