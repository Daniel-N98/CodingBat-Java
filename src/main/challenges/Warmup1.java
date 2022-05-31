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

    /**
     * Given a string, take the first 2 chars and return the string with the 2 chars added
     * at both the front and back, so "kitten" yields"kikittenki".
     * If the string length is less than 2, use whatever chars are there.
     * <p>
     * front22("kitten") → "kikittenki"
     * front22("Ha") → "HaHaHa"
     * front22("abc") → "ababcab"
     *
     * @param str String value
     * @return String parameter with first two characters placed at the beginning, and end
     */
    public String front22(String str) {
        String sub = (str.length() >= 2
                ? str.substring(0, 2)
                : str);
        return sub + str + sub;
    }

    /**
     * Given a string, return true if the string starts with "hi" and false otherwise.
     * <p>
     * startHi("hi there") → true
     * startHi("hi") → true
     * startHi("hello hi") → false
     *
     * @param str String value
     * @return True if String parameter starts with 'hi', false otherwise
     */
    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    /**
     * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     * <p>
     * icyHot(120, -1) → true
     * icyHot(-1, 120) → true
     * icyHot(2, 120) → false
     *
     * @param temp1 int value
     * @param temp2 int value
     * @return True if one int parameter is above 100 & the other is below 0. False otherwise
     */
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100 || (temp2 < 0 && temp1 > 100));
    }

    /**
     * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
     * <p>
     * in1020(12, 99) → true
     * in1020(21, 12) → true
     * in1020(8, 99) → false
     *
     * @param a int value
     * @param b int value
     * @return True if either value is in the range 10..20 inclusive
     */
    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20 || b >= 10 && b <= 20);
    }

    /**
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 3 int values, return true if 1 or more of them are teen.
     * <p>
     * hasTeen(13, 20, 10) → true
     * hasTeen(20, 19, 10) → true
     * hasTeen(20, 10, 13) → true
     *
     * @param a int value
     * @param b int value
     * @param c int value
     * @return True if any int value is in range 13..19 inclusive
     */
    public boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19)
                || (b >= 13 && b <= 19)
                || (c >= 13 && c <= 19));
    }

    /**
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 2 int values, return true if one or the other is teen, but not both.
     * <p>
     * loneTeen(13, 99) → true
     * loneTeen(21, 19) → true
     * loneTeen(13, 13) → false
     *
     * @param a int value
     * @param b int value
     * @return True if one is in range 13..19 inclusive and the other is not
     */
    public boolean loneTeen(int a, int b) {
        if (a >= 13 && a <= 19) {
            return !(b >= 13 && b <= 19);
        } else {
            return (b >= 13 && b <= 19);
        }
    }

    /**
     * Given a string, if the string "del" appears starting at index 1,
     * return a string where that "del" has been deleted.
     * Otherwise, return the string unchanged.
     * <p>
     * delDel("adelbc") → "abc"
     * delDel("adelHello") → "aHello"
     * delDel("adedbc") → "adedbc"
     *
     * @param str String value
     * @return String parameter with 'del' removed if it appears starting at index 1
     */
    public String delDel(String str) {
        if (str.length() >= 4
                && str.substring(1, 4).equalsIgnoreCase("del")) {
            str = str.replaceFirst("del", "");
        }
        return str;
    }

    /**
     * Return true if the given string begins with "mix", except the 'm' can be anything,
     * so "pix", "9ix" ... all count.
     *
     * mixStart("mix snacks") → true
     * mixStart("pix snacks") → true
     * mixStart("piz snacks") → false
     *
     * @param str String value
     * @return True if the second and third characters are "ix"
     */
    public boolean mixStart(String str) {
        return str.length() >= 3 && str.startsWith("ix", 1);
    }

    /**
     * Given a string, return a string made of the first 2 chars (if present),
     * however include first char only if it is 'o' and include the second only if it is 'z',
     * so "ozymandias" yields "oz".
     *
     * startOz("ozymandias") → "oz"
     * startOz("bzoo") → "z"
     * startOz("oxx") → "o"
     *
     * @param str String value
     * @return First and or second character of String parameter when first == 'o' && second == 'z'
     */
    public String startOz(String str) {
        String s = "";

        if (str.startsWith("oz")) return "oz";
        if (str.startsWith("o")) s += "o";
        if (str.startsWith("z", 1)) s += "z";

        return s;
    }

    /**
     * Given three int values, a b c, return the largest.
     *
     * intMax(1, 2, 3) → 3
     * intMax(1, 3, 2) → 3
     * intMax(3, 2, 1) → 3
     *
     * @param a int value
     * @param b int value
     * @param c int value
     * @return Largest of the three int parameters
     */
    public int intMax(int a, int b, int c) {
        return (a > b && a > c)
                ? a
                : Math.max(b, c);
    }

    /**
     * Given 2 int values, return whichever value is nearest to the value 10,
     * or return 0 in the event of a tie.
     * Note that Math.abs(n) returns the absolute value of a number.
     *
     * close10(8, 13) → 8
     * close10(13, 8) → 8
     * close10(13, 7) → 0
     *
     * @param a int value
     * @param b int value
     * @return Closes int parameter to 10, or 0 in event of tie
     */
    public int close10(int a, int b) {

        int aDiff = Math.abs(10 - a);
        int bDiff = Math.abs(10 - b);

        if (aDiff == bDiff) return 0;
        return aDiff > bDiff
                ? b
                : a;
    }


}
