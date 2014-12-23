package jackode.algorithm.string;

/**
 Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 For example,
 Given s = "Hello World",
 return 5.
 * Created by liujiankang on 12/23/14.
 */
public class LastWordLength {
    public int lengthOfLastWord(String s) {
        if (null == s || s.isEmpty()) return 0;
        int i = s.length() - 1;
        while (s.charAt(i) == ' ' && i > 0) i--;
        if (s.charAt(i) == ' ') return 0;
        int j = i;
        while (s.charAt(j) != ' ' && j > 0) j--;
        if (s.charAt(j) == ' ') return i - j;
        else
            return i - j + 1;
    }
}
