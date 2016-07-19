package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/19.
 * <p>
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * <p>
 * Example 1:
 * Given s = "hello", return "holle".
 * <p>
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 * <p>
 * Note:
 * The vowels does not include the letter "y".
 */
public class ReverseVowelsofAString {

    public static void main(String[] args) {

        System.out.println(reverseVowels("hello") + "");
        System.out.println(reverseVowels("leetcode") + "");
        System.out.println(reverseVowels("helloleetcode") + "");
        System.out.println(reverseVowels("aA") + "");
    }


    private static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int lastIndex = chars.length - 1;
        for (int i = 0; i < lastIndex; i++) {
            char cI = chars[i];
            if (cI == 'a' || cI == 'e' || cI == 'i' || cI == 'o' || cI == 'u' || cI == 'A' || cI == 'E' || cI == 'I' || cI == 'O' || cI == 'U') {
                boolean isBreak = false;
                for (int j = lastIndex; j > i && !isBreak; j--) {
                    char cJ = chars[j];
                    if (cJ == 'a' || cJ == 'e' || cJ == 'i' || cJ == 'o' || cJ == 'u' || cJ == 'A' || cJ == 'E' || cJ == 'I' || cJ == 'O' || cJ == 'U') {
                        char cTemp = chars[i];
                        chars[i] = chars[j];
                        chars[j] = cTemp;
                        lastIndex = j - 1;
                        isBreak = true;
                    }
                }
            }
        }
        return String.valueOf(chars);
    }

}
