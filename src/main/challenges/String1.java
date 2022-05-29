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
}
