package challenges;

public class Warmup1 {

    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday, or we're on vacation. Return true if we sleep in.
     *
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     *
     * @param weekday indicates whether it's a weekday
     * @param vacation indicates whether on vacation
     * @return True if Weekday = false || Vacation = true
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }

    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
     * We are in trouble if they are both smiling or if neither of them is smiling.
     * Return true if we are in trouble.
     *
     * monkeyTrouble(true, true) → true
     * monkeyTrouble(false, false) → true
     * monkeyTrouble(true, false) → false
     *
     * @param aSmile Boolean value
     * @param bSmile Boolean value
     * @return True if both Boolean parameters are equal
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile || !aSmile && !bSmile);
    }

    /**
     * Given two int values, return their sum. Unless the two values are the same,
     * then return double their sum.
     *
     * sumDouble(1, 2) → 3
     * sumDouble(3, 2) → 5
     * sumDouble(2, 2) → 8
     *
     * @param a int value
     * @param b int value
     * @return Sum of int parameters, or double their sum if the int parameters are equal
     */
    public int sumDouble(int a, int b) {
        return a == b
                ? ( (a + b) * 2)
                : a + b;
    }

    /**
     * Given an int n, return the absolute difference between n and 21,
     * except return double the absolute difference if n is over 21.
     *
     * diff21(19) → 2
     * diff21(10) → 11
     * diff21(21) → 0
     *
     * @param n int value
     * @return Difference between int parameter, and 21. Difference*2 if the int parameter is over 21
     */
    public int diff21(int n) {
        return (n > 21 ? (n - 21) * 2 : (21 - n));
    }

    /**
     * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
     * We are in trouble if the parrot is talking and the hour is before 7 or after 20.
     * Return true if we are in trouble.
     *
     * parrotTrouble(true, 6) → true
     * parrotTrouble(true, 7) → false
     * parrotTrouble(false, 6) → false
     *
     * @param talking Boolean value
     * @param hour int value
     * @return True if hour is before 7 or after 20, false otherwise
     */
    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }

    /**
     * Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
     *
     * makes10(9, 10) → true
     * makes10(9, 9) → false
     * makes10(1, 9) → true
     *
     * @param a int value
     * @param b int value
     * @return True if either int parameter is equal to 10, or their sum is equal to 10
     */
    public boolean makes10(int a, int b) {
        return (a + b == 10 || a == 10 || b == 10);
    }

}
