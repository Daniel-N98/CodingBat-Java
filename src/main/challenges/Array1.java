package challenges;

import java.util.Arrays;
import java.util.function.Predicate;

public class Array1 {

    /**
     * Given an array of ints, return true if 6 appears as either the first or last element in the array.
     * The array will be length 1 or more.
     * <p>
     * firstLast6([1, 2, 6]) → true
     * firstLast6([6, 1, 2, 3]) → true
     * firstLast6([13, 6, 1, 2, 3]) → false
     *
     * @param nums int[]
     * @return True if the first or last element of int[] parameter is 6, false otherwise
     */
    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }

    /**
     * Given an array of ints, return true if the array is length 1 or more,
     * and the first element and the last element are equal.
     * <p>
     * sameFirstLast([1, 2, 3]) → false
     * sameFirstLast([1, 2, 3, 1]) → true
     * sameFirstLast([1, 2, 1]) → true
     *
     * @param nums int[]
     * @return True if the int[] parameter is >= 1, and the first and last elements are equal
     */
    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    /**
     * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
     * <p>
     * makePi() → [3, 1, 4]
     *
     * @return int[] with 3 elements containing the first 3 values of PI
     */
    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    /**
     * Given 2 arrays of ints, a and b, return true if they have the same first element,
     * or they have the same last element. Both arrays will be length 1 or more.
     * <p>
     * commonEnd([1, 2, 3], [7, 3]) → true
     * commonEnd([1, 2, 3], [7, 3, 2]) → false
     * commonEnd([1, 2, 3], [1, 3]) → true
     *
     * @param a int[]
     * @param b int[]
     * @return True if both int[] parameters have the same first, or last element. False otherwise
     */
    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    /**
     * Given an array of ints length 3, return the sum of all the elements.
     * <p>
     * sum3([1, 2, 3]) → 6
     * sum3([5, 11, 2]) → 18
     * sum3([7, 0, 0]) → 7
     *
     * @param nums int[]
     * @return int value sum of all elements in int[] parameter
     */
    public int sum3(int[] nums) {
        int total = 0;
        for (int num : nums) total += num;

        return total;
    }

    /**
     * Given an array of ints length 3, return an array with the elements "rotated left",
     * so {1, 2, 3} yields {2, 3, 1}.
     * <p>
     * rotateLeft3([1, 2, 3]) → [2, 3, 1]
     * rotateLeft3([5, 11, 9]) → [11, 9, 5]
     * rotateLeft3([7, 0, 0]) → [0, 0, 7]
     *
     * @param nums int[]
     * @return int[] with all elements in int[] parameter "rotated left"
     */
    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    /**
     * Given an array of ints length 3, return a new array with the elements in reverse order,
     * so {1, 2, 3} becomes {3, 2, 1}.
     * <p>
     * reverse3([1, 2, 3]) → [3, 2, 1]
     * reverse3([5, 11, 9]) → [9, 11, 5]
     * reverse3([7, 0, 0]) → [0, 0, 7]
     *
     * @param nums int[]
     * @return int[] parameters elements in reverse order
     */
    public int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    /**
     * Given an array of ints length 3, figure out which is larger, the first or last element in the array,
     * and set all the other elements to be that value. Return the changed array.
     * <p>
     * maxEnd3([1, 2, 3]) → [3, 3, 3]
     * maxEnd3([11, 5, 9]) → [11, 11, 11]
     * maxEnd3([2, 11, 3]) → [3, 3, 3]
     *
     * @param nums int[]
     * @return int[] length 3 containing the highest value from int[] parameter's first,last element
     * 3 times.
     */
    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        return new int[]{max, max, max};
    }

    /**
     * Given an array of ints, return the sum of the first 2 elements in the array.
     * If the array length is less than 2, just sum up the elements that exist,
     * returning 0 if the array is length 0.
     * <p>
     * sum2([1, 2, 3]) → 3
     * sum2([1, 1]) → 2
     * sum2([1, 1, 1, 1]) → 2
     *
     * @param nums int[]
     * @return The sum of the first two int[] parameter's elements, or the sum of all values if length < 2
     */
    public int sum2(int[] nums) {
        if (nums.length < 2) {
            return Arrays.stream(nums).sum();
        }
        return nums[0] + nums[1];
    }

    /**
     * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
     * <p>
     * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
     * middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
     * middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
     *
     * @param a int[]
     * @param b int[]
     * @return int[] length 2 containing the middle elements of both int[] parameters
     */
    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    /**
     * Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
     * The original array will be length 1 or more.
     * <p>
     * makeEnds([1, 2, 3]) → [1, 3]
     * makeEnds([1, 2, 3, 4]) → [1, 4]
     * makeEnds([7, 4, 6, 2]) → [7, 2]
     *
     * @param nums int[]
     * @return int[] length 2 containing the first and last elements of int[] parameter
     */
    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    /**
     * Given an int array length 2, return true if it contains a 2 or a 3.
     * <p>
     * has23([2, 5]) → true
     * has23([4, 3]) → true
     * has23([4, 5]) → false
     *
     * @param nums int[]
     * @return True if int[] parameter contains a 2 or 3
     */
    public boolean has23(int[] nums) {
        return Arrays.stream(nums).anyMatch(num -> num == 2 || num == 3);
    }

    /**
     * Given an int array length 2, return true if it does not contain a 2 or 3.
     * <p>
     * no23([4, 5]) → true
     * no23([4, 2]) → false
     * no23([3, 5]) → false
     *
     * @param nums int[]
     * @return True if int[] parameter does not contain a 2 or 3
     */
    public boolean no23(int[] nums) {
        return Arrays.stream(nums).noneMatch(num -> num == 2 || num == 3);
    }

    /**
     * Given an int array, return a new array with double the length where its last element is the same as the original array,
     * and all the other elements are 0. The original array will be length 1 or more.
     * Note: by default, a new int array contains all 0's.
     * <p>
     * makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
     * makeLast([1, 2]) → [0, 0, 0, 2]
     * makeLast([3]) → [0, 3]
     *
     * @param nums int[]
     * @return int[] length (int[] parameter length * 2) with the last element being the last element in int[] parameter
     */
    public int[] makeLast(int[] nums) {
        int[] returnNums = new int[nums.length * 2];
        returnNums[returnNums.length - 1] = nums[nums.length - 1];

        return returnNums;
    }

    /**
     * Given an int array, return true if the array contains 2 twice,
     * or 3 twice. The array will be length 0, 1, or 2.
     * <p>
     * double23([2, 2]) → true
     * double23([3, 3]) → true
     * double23([2, 3]) → false
     *
     * @param nums int[]
     * @return True if int[] parameter contains 2 twice, or 3 twice. False otherwise
     */
    public boolean double23(int[] nums) {
        if (Arrays.stream(nums).filter(num -> num == 2).toArray().length >= 2) {
            return true;
        }
        return Arrays.stream(nums)
                .filter(num -> num == 3)
                .toArray()
                .length >= 2;
    }

    /**
     * Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
     * set the 3 element to 0. Return the changed array.
     * <p>
     * fix23([1, 2, 3]) → [1, 2, 0]
     * fix23([2, 3, 5]) → [2, 0, 5]
     * fix23([1, 2, 1]) → [1, 2, 1]
     *
     * @param nums int[]
     * @return int[] parameter without '3' if a '2' precedes it
     */
    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        } else if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    /**
     * Start with 2 int arrays, a and b, of any length.
     * Return how many of the arrays have 1 as their first element.
     * <p>
     * start1([1, 2, 3], [1, 3]) → 2
     * start1([7, 2, 3], [1]) → 1
     * start1([1, 2], []) → 1
     *
     * @param a int[]
     * @param b int[]
     * @return Count of int[] parameters with the first element being 1
     */
    public int start1(int[] a, int[] b) {
        int total = 0;
        if (a.length >= 1 && a[0] == 1) {
            total++;
        }
        if (b.length >= 1 && b[0] == 1) {
            total++;
        }
        return total;
    }

    /**
     * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
     * Return the array which has the largest sum. In event of a tie, return a
     * <p>
     * biggerTwo([1, 2], [3, 4]) → [3, 4]
     * biggerTwo([3, 4], [1, 2]) → [3, 4]
     * biggerTwo([1, 1], [1, 2]) → [1, 2]
     *
     * @param a int[]
     * @param b int[]
     * @return int[] parameter with the greatest sum of elements
     */
    public int[] biggerTwo(int[] a, int[] b) {
        int totA = a[0] + a[1];
        int totB = b[0] + b[1];

        return totA >= totB
                ? a
                : b;
    }

    /**
     * Given an array of ints of even length,
     * return a new array length 2 containing the middle two elements from the original array.
     * The original array will be length 2 or more.
     * <p>
     * makeMiddle([1, 2, 3, 4]) → [2, 3]
     * makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
     * makeMiddle([1, 2]) → [1, 2]
     *
     * @param nums int[]
     * @return int[] length 2 containing middle two elements from int[] parameter
     */
    public int[] makeMiddle(int[] nums) {
        return new int[]{nums[(nums.length - 1) / 2], nums[(nums.length) / 2]};
    }

    /**
     * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
     * <p>
     * plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
     * plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
     * plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
     *
     * @param a int[]
     * @param b int[]
     * @return int[] of both int[] parameters combined
     */
    public int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

}
