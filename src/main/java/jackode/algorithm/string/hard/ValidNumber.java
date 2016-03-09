package jackode.algorithm.string.hard;

/**
 *
     Validate if a given string is numeric.
     Some examples:
     "0" => true
     " 0.1 " => true
     "abc" => false
     "1 a" => false
     "2e10" => true
 * Created by liujiankang on 12/23/14.
 */
public class ValidNumber {
    private final static String SPECIAL_VALID_CHARACTERS = "+-.e";

    public boolean isNumber(String s){
        if (s == null) return false;
        s = s.trim();
        if (s.isEmpty()) return false;
        int len = s.length();

        s = s.toLowerCase();

        boolean hasSign = false, hasDot = false;
        boolean hasExp = false, hasDigit = false;
        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            if (!isValidCharacter(c)) return false;
            switch (c){
                case '+':
                case '-':
                    if ((i!=0 && s.charAt(i-1) != 'e') || i==len -1){
                        return false;
                    } else{
                        hasSign = true;
                    }
                    break;
                case '.':
                    if (len == 1 || (len == 2 && hasSign) || hasExp || hasDot){
                        return false;
                    } else {
                        hasDot = true;
                    }
                    break;
                case 'e':
                    if (i==0 || i==len-1 || !hasDigit || hasExp){
                        return false;
                    } else {
                        hasExp = true;
                    }
                    break;
                default:
                    hasDigit = true;
                    break;
            }
        }
        return true;
    }

    private boolean isDigit(char c){
        return c <= '9' && c >= '0';
    }

    private boolean isValidCharacter(char c){
        return SPECIAL_VALID_CHARACTERS.contains("" + c) || isDigit(c);
    }
}
