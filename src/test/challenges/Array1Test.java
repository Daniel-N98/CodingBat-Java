package challenges;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}