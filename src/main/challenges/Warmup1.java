package challenges;

public class Warmup1 {

    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday, or we're on vacation. Return true if we sleep in.
     * <p>
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     *
     * @param weekday  indicates whether it's a weekday
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
     * <p>
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
     * <p>
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
                ? ((a + b) * 2)
                : a + b;
    }

    /**
     * Given an int n, return the absolute difference between n and 21,
     * except return double the absolute difference if n is over 21.
     * <p>
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
     * <p>
     * parrotTrouble(true, 6) → true
     * parrotTrouble(true, 7) → false
     * parrotTrouble(false, 6) → false
     *
     * @param talking Boolean value
     * @param hour    int value
     * @return True if hour is before 7 or after 20, false otherwise
     */
    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }

    /**
     * Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
     * <p>
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

    /**
     * Given an int n, return true if it is within 10 of 100 or 200.
     * Note: Math.abs(num) computes the absolute value of a number.
     * <p>
     * nearHundred(93) → true
     * nearHundred(90) → true
     * nearHundred(89) → false
     *
     * @param n int value
     * @return True if int parameter is within 10 of 10, or 200.
     */
    public boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10
                || Math.abs(200 - n) <= 10;
    }

    /**
     * Given 2 int values, return true if one is negative and one is positive.
     * Except if the parameter "negative" is true, then return true only if both are negative.
     * <p>
     * posNeg(1, -1, false) → true
     * posNeg(-1, 1, false) → true
     * posNeg(-4, -5, true) → true
     *
     * @param a        int value
     * @param b        int value
     * @param negative boolean value
     * @return Boolean value
     */
    public boolean posNeg(int a, int b, boolean negative) {
        // Negative is true, so we return true if both a & b int parameters are negative
        if (negative) return (a < 0 && b < 0);

        return (a < 0 && b > 0)
                || (b < 0 && a > 0);
    }

    /**
     * Given a string, return a new string where "not " has been added to the front.
     * However, if the string already begins with "not", return the string unchanged.
     * Note: use .equals() to compare 2 strings.
     * <p>
     * notString("candy") → "not candy"
     * notString("x") → "not x"
     * notString("not bad") → "not bad"
     *
     * @param str String value
     * @return String parameter with 'not ' in front if no already present
     */
    public String notString(String str) {
        if (str.split(" ")[0].equalsIgnoreCase("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }

    /**
     * Given a non-empty string and an int n, return a new string where the char at index n has been removed.
     * The value of n will be a valid index of a char in the original string
     * (i.e. n will be in the range 0...str.length()-1 inclusive).
     * <p>
     * missingChar("kitten", 1) → "ktten"
     * missingChar("kitten", 0) → "itten"
     * missingChar("kitten", 4) → "kittn"
     *
     * @param str String value
     * @param n   int value
     * @return String parameter with the char at index n removed
     */
    public String missingChar(String str, int n) {
        return (str.substring(0, n) + str.substring(n + 1));
    }

    /**
     * Given a string, return a new string where the first and last chars have been exchanged.
     * <p>
     * frontBack("code") → "eodc"
     * frontBack("a") → "a"
     * frontBack("ab") → "ba"
     *
     * @param str String value
     * @return String parameter with the first & last characters switched
     */
    public String frontBack(String str) {
        if (str.length() <= 1) return str;
        int length = str.length() - 1;

        return str.charAt(length) + str.substring(1, length) + str.charAt(0);
    }

    /**
     * Given a string, we'll say that the front is the first 3 chars of the string.
     * If the string length is less than 3, the front is whatever is there.
     * Return a new string which is 3 copies of the front.
     * <p>
     * front3("Java") → "JavJavJav"
     * front3("Chocolate") → "ChoChoCho"
     * front3("abc") → "abcabcabc"
     *
     * @param str String value
     * @return String parameters first 3 characters (or total characters if < 3), repeated 3 times
     */
    public String front3(String str) {
        String s = str.substring(0, Math.min(str.length(), 3));
        return s + s + s;
    }

    /**
     * Given a string, take the last char and return a new string with the last char added at the front and back,
     * so "cat" yields "tcatt". The original string will be length 1 or more.
     * <p>
     * backAround("cat") → "tcatt"
     * backAround("Hello") → "oHelloo"
     * backAround("a") → "aaa"
     *
     * @param str String value
     * @return String parameter with the last character added to the beginning and end
     */
    public String backAround(String str) {
        char arr = str.charAt(str.length() - 1);
        return arr + str + arr;
    }

    /**
     * Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
     * Use the % "mod" operator -- see Introduction to Mod
     * <p>
     * or35(3) → true
     * or35(10) → true
     * or35(8) → false
     *
     * @param n int value
     * @return True if int parameter is a multiple of 3, or 5
     */
    public boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }


}
