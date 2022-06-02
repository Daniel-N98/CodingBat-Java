package challenges;

public class Array1 {

    /**
     * Given an array of ints, return true if 6 appears as either the first or last element in the array.
     * The array will be length 1 or more.
     *
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
     *
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
     *
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
     *
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
     *
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
     *
     * rotateLeft3([1, 2, 3]) → [2, 3, 1]
     * rotateLeft3([5, 11, 9]) → [11, 9, 5]
     * rotateLeft3([7, 0, 0]) → [0, 0, 7]
     *
     * @param nums int[]
     * @return int[] with all elements in int[] parameter "rotated left"
     */
    public int[] rotateLeft3(int[] nums) {
        return new int[] {nums[1], nums[2], nums[0]};
    }

    /**
     * Given an array of ints length 3, return a new array with the elements in reverse order,
     * so {1, 2, 3} becomes {3, 2, 1}.
     *
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
     *
     * maxEnd3([1, 2, 3]) → [3, 3, 3]
     * maxEnd3([11, 5, 9]) → [11, 11, 11]
     * maxEnd3([2, 11, 3]) → [3, 3, 3]
     *
     * @param nums int[]
     * @return int[] length 3 containing the highest value from int[] parameter's first,last element
     *              3 times.
     */
    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        return new int[]{max, max, max};
    }

}
