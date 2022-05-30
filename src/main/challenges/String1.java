package challenges;

public class String1 {

    /**
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     * <p>
     * helloName("Bob") → "Hello Bob!"
     * helloName("Alice") → "Hello Alice!"
     * helloName("X") → "Hello X!"
     *
     * @param name to be greeted
     * @return a pleasant greeting
     */
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    /**
     * Given two strings, a and b, return the result of putting them together in the order abba,
     * e.g. "Hi" and "Bye" returns "HiByeByeHi".
     * <p>
     * makeAbba("Hi", "Bye") → "HiByeByeHi"
     * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
     * makeAbba("What", "Up") → "WhatUpUpWhat"
     *
     * @param a String
     * @param b String
     * @return 'abba' connected String
     */
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    /**
     * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
     * In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
     * Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
     * <p>
     * makeTags("i", "Yay") → "<i>Yay</i>"
     * makeTags("i", "Hello") → "<i>Hello</i>"
     * makeTags("cite", "Yay") → "<cite>Yay</cite>"
     *
     * @param tag  HTML tag
     * @param word to go inside the HTML tag
     * @return String - complete HTML tag
     */
    public String makeTags(String tag, String word) {
        return String.format("<%s>%s</%s>", tag, word, tag);
    }

    /**
     * Given an "out" string length 4, such as "<<>>", and a word,
     * return a new string where the word is in the middle of the out string,
     * e.g. "<<word>>".
     * Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
     * <p>
     * makeOutWord("<<>>", "Yay") → "<<Yay>>"
     * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
     * makeOutWord("[[]]", "word") → "[[word]]"
     *
     * @param out  symbols
     * @param word to be placed inside the symbols
     * @return word enclosed by symbols
     */
    public String makeOutWord(String out, String word) {
        return String.format("%s%s%s", out.substring(0, 2), word, out.substring(2, 4));
    }

    /**
     * Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
     * The string length will be at least 2.
     * <p>
     * extraEnd("Hello") → "lololo"
     * extraEnd("ab") → "ababab"
     * extraEnd("Hi") → "HiHiHi"
     *
     * @param str String value
     * @return String parameters last two characters repeated 3 times
     */
    public String extraEnd(String str) {
        String last = str.substring(str.length() - 2);
        return last + last + last;
    }

    /**
     * Given a string, return the string made of its first two chars,
     * so the String "Hello" yields "He". If the string is shorter than length 2,
     * return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
     * Note that str.length() returns the length of a string.
     * <p>
     * firstTwo("Hello") → "He"
     * firstTwo("abcdefg") → "ab"
     * firstTwo("ab") → "ab"
     *
     * @param str String value
     * @return the first to characters String parameter
     */
    public String firstTwo(String str) {
        if (str.length() < 2) return str; // Check to make sure there's at least two characters
        return str.substring(0, 2);
    }

    /**
     * Given a string of even length, return the first half.
     * So the string "WooHoo" yields "Woo".
     * <p>
     * firstHalf("WooHoo") → "Woo"
     * firstHalf("HelloThere") → "Hello"
     * firstHalf("abcdef") → "abc"
     *
     * @param str String value
     * @return First half of the String parameter
     */
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    /**
     * Given a string, return a version without the first and last char,
     * so "Hello" yields "ell". The string length will be at least 2.
     * <p>
     * withoutEnd("Hello") → "ell"
     * withoutEnd("java") → "av"
     * withoutEnd("coding") → "odin"
     *
     * @param str String value
     * @return String parameter without first & last characters.
     */
    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * Given 2 strings, a and b, return a string of the form short+long+short,
     * with the shorter string on the outside and the longer string on the inside.
     * The strings will not be the same length, but they may be empty (length 0).
     * <p>
     * comboString("Hello", "hi") → "hiHellohi"
     * comboString("hi", "Hello") → "hiHellohi"
     * comboString("aaa", "b") → "baaab"
     *
     * @param a String value
     * @param b String value
     * @return String value
     */
    public String comboString(String a, String b) {
        return a.length() > b.length() ?
                b + a + b :
                a + b + a;
    }

    /**
     * Given 2 strings, return their concatenation, except omit the first char of each.
     * The strings will be at least length 1.
     * <p>
     * nonStart("Hello", "There") → "ellohere"
     * nonStart("java", "code") → "avaode"
     * nonStart("shotl", "java") → "hotlava"
     *
     * @param a String value
     * @param b String value
     * @return String values combined without the first char of each
     */
    public String nonStart(String a, String b) {
        return String.format("%s%s", a.substring(1), b.substring(1));
    }

    /**
     * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
     * The string length will be at least 2.
     * <p>
     * left2("Hello") → "lloHe"
     * left2("java") → "vaja"
     * left2("Hi") → "Hi"
     *
     * @param str String value
     * @return String parameter with the first two characters placed at the end
     */
    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    /**
     * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
     * The string length will be at least 2.
     * <p>
     * right2("Hello") → "loHel"
     * right2("java") → "vaja"
     * right2("Hi") → "Hi"
     *
     * @param str String value
     * @return String parameter with the last two characters placed at the beginning
     */
    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    /**
     * Given a string, return a string length 1 from its front, unless front is false,
     * in which case return a string length 1 from its back. The string will be non-empty.
     * <p>
     * theEnd("Hello", true) → "H"
     * theEnd("Hello", false) → "o"
     * theEnd("oh", true) → "o"
     *
     * @param str   String value
     * @param front Boolean value
     * @return First character of String parameter if Boolean parameter is true, last character otherwise
     */
    public String theEnd(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }

    /**
     * Given a string, return a version without both the first and last char of the string.
     * The string may be any length, including 0.
     * <p>
     * withouEnd2("Hello") → "ell"
     * withouEnd2("abc") → "b"
     * withouEnd2("ab") → ""
     *
     * @param str String value
     * @return String parameter without first, and last character.
     */
    public String withouEnd(String str) {
        if (str.length() <= 2) return "";

        return str.substring(1, str.length() - 1);
    }

    /**
     * Given a string of even length, return a string made of the middle two chars,
     * so the string "string" yields "ri". The string length will be at least 2.
     * <p>
     * middleTwo("string") → "ri"
     * middleTwo("code") → "od"
     * middleTwo("Practice") → "ct"
     *
     * @param str String value
     * @return Middle two character of the String parameter
     */
    public String middleTwo(String str) {
        return str.substring((str.length() - 1) / 2, (str.length() / 2) + 1);
    }

    /**
     * Given a string, return true if it ends in "ly".
     * <p>
     * endsLy("oddly") → true
     * endsLy("y") → false
     * endsLy("oddy") → false
     *
     * @param str String value
     * @return True if str ends in 'ly', false otherwise
     */
    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    /**
     * Given a string and an int n, return a string made of the first and last n chars from the string.
     * The string length will be at least n.
     *
     * @param str String value
     * @param n   amount of characters from each side of String parameter
     * @return String value made of the first and last n chars from the String parameter
     */
    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    /**
     * Given a string and an index, return a string length 2 starting at the given index.
     * If the index is too big or too small to define a string length 2, use the first 2 chars.
     * The string length will be at least 2.
     * <p>
     * twoChar("java", 0) → "ja"
     * twoChar("java", 2) → "va"
     * twoChar("java", 3) → "ja"
     *
     * @param str   String value
     * @param index index to begin at
     * @return String value of length 2 containing the two characters from String parameter
     * starting at int parameter.
     */
    public String twoChar(String str, int index) {
        if (index <= 0 || (index + 2) > str.length()) return str.substring(0, 2);

        return str.substring(index, index + 2);
    }

    /**
     * Given a string of odd length, return the string length 3 from its middle,
     * so "Candy" yields "and". The string length will be at least 3.
     * <p>
     * middleThree("Candy") → "and"
     * middleThree("and") → "and"
     * middleThree("solving") → "lvi"
     *
     * @param str String value of odd length
     * @return middle three characters of String parameter
     */
    public String middleThree(String str) {
        int half = str.length() / 2;
        return str.substring(half - 1, half + 2);
    }

    /**
     * Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
     * such as with "badxxx" or "xbadxx" but not "xxbadxx".
     * The string may be any length, including 0. Note: use .equals() to compare 2 strings.
     * <p>
     * hasBad("badxx") → true
     * hasBad("xbadxx") → true
     * hasBad("xxbadxx") → false
     *
     * @param str String value
     * @return True if 'bad' appears starting at index 0, or 1. False otherwise
     */
    public boolean hasBad(String str) {
        return str.startsWith("bad") || str.startsWith("bad", 1);
    }

    /**
     * Given a string, return a string length 2 made of its first 2 chars.
     * If the string length is less than 2, use '@' for the missing chars.
     * <p>
     * atFirst("hello") → "he"
     * atFirst("hi") → "hi"
     * atFirst("h") → "h@"
     *
     * @param str String value
     * @return First two characters of String parameter, or '@' in place of any missing characters.
     */
    public String asFirst(String str) {
        return str.length() == 0 ? "@@"
                : str.length() == 1 ? str.charAt(0) + "@"
                : str.substring(0, 2);
    }

    /**
     * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
     * so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
     * <p>
     * lastChars("last", "chars") → "ls"
     * lastChars("yo", "java") → "ya"
     * lastChars("hi", "") → "h@"
     *
     * @param a String value
     * @param b String value
     * @return Last characters of each String, or a '@' for each last character missing
     */
    public String lastChars(String a, String b) {
        if (a.length() < 2) {
            a = a + "@";
        }

        if (b.length() < 2) {
            b = b + "@";
        }

        return "" + a.charAt(0) + b.charAt(b.length() - 1);
    }

    /**
     * Given two strings, append them together (known as "concatenation") and return the result.
     * However, if the concatenation creates a double-char, then omit one of the chars,
     * so "abc" and "cat" yields "abcat".
     * <p>
     * conCat("abc", "cat") → "abcat"
     * conCat("dog", "cat") → "dogcat"
     * conCat("abc", "") → "abc"
     *
     * @param a String value
     * @param b String value
     * @return Concatenated String of String parameters. If a double-char is created from the concat, one of the
     * chars will be omitted.
     */
    public String conCat(String a, String b) {
        if (!(b.isEmpty() || a.isEmpty())) {
            // Sets b = b without first character if b's first character == a's last character.
            if (b.charAt(0) == a.charAt(a.length() - 1)) {
                b = b.substring(1);
            }
        }

        return a + b;
    }

    /**
     * Given a string of any length, return a new string where the last 2 chars, if present,
     * are swapped, so "coding" yields "codign".
     * <p>
     * lastTwo("coding") → "codign"
     * lastTwo("cat") → "cta"
     * lastTwo("ab") → "ba"
     *
     * @param str String value
     * @return String parameter with last two characters swapped, if present.
     */
    public String lastTwo(String str) {
        if (str.length() < 2) return str;

        int length = str.length();

        return str.substring(0, length - 2) + str.charAt(length - 1) + str.charAt(length - 2);
    }

    /**
     * Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
     * <p>
     * seeColor("redxx") → "red"
     * seeColor("xxred") → ""
     * seeColor("blueTimes") → "blue"
     *
     * @param str String value
     * @return The color at the beginning of the String parameter, or an Empty String if no colors present
     */
    public String seeColor(String str) {
        boolean startsWithRed = str.startsWith("red");

        return (startsWithRed)
                ? "red"
                : str.startsWith("blue")
                ? "blue"
                : "";
    }

    /**
     * Given a string, return true if the first 2 chars in the string also appear at the end of the string,
     * such as with "edited".
     * <p>
     * frontAgain("edited") → true
     * frontAgain("edit") → false
     * frontAgain("ed") → true
     *
     * @param str String value
     * @return True if the first two characters of String parameter are equal to the last two characters
     * of the String parameter.
     */
    public boolean frontAgain(String str) {
        if (str.length() < 2) return false;

        return str.substring(0, 2).equals(str.substring(str.length() - 2));
    }

    /**
     * Given two strings, append them together (known as "concatenation") and return the result.
     * However, if the strings are different lengths, omit chars from the longer string so that
     * it is the same length as the shorter string.
     * So "Hello" and "Hi" yield "loHi". The strings may be any length.
     *
     * minCat("Hello", "Hi") → "loHi"
     * minCat("Hello", "java") → "ellojava"
     * minCat("java", "Hello") → "javaello"
     *
     * @param a String value
     * @param b String value
     * @return String value
     */
    public String minCat(String a, String b){
        if (a.length() == b.length())return a+b;

        int aLength = a.length();
        int bLength = b.length();
        // Compare the String lengths to find the largest
        int diff = Integer.compare(aLength, bLength);

        // Diff will only be -1, or 1 as we return above if the String parameter lengths are equal.
        if (diff == - 1){
            // - 1 = first int (aLength) is smaller.
            b = b.substring(bLength - aLength);
        }else{
            // 1 = second int (bLength) is smaller.
            a = a.substring(aLength - bLength);
        }

        return a + b;
    }
}
