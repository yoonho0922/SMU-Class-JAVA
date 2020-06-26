package week15_finals;

public class ConvertChars {
    public static char[] toLowerCase(char[] chars){
        for(int i =0; i < chars.length; i++){
            if(chars[i] >= 'A' && chars[i] <= 'Z')
                chars[i] = (char) ('a' + (int) chars[i] - (int) 'A');
        }
        return chars;
    }
}
