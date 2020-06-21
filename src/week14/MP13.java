package week14;

import java.util.HashMap;
import java.util.Map;

public class MP13 {
    String str;

    MP13(String s){
        str = s;
    }

    public Map<String, Integer> countDigitsAndLetters(){
        char[] chars = str.toCharArray();
        Map<String,Integer> countDL = new HashMap<String, Integer>();

        //count Logic
        for(char c : chars){
            if(Character.isDigit(c)){
                if(countDL.containsKey("DIGITS")){
                    countDL.put("DIGITS", countDL.get("DIGITS")+1);
                }else{
                    countDL.put("DIGITS", 1);
                }
            }else{
                if(countDL.containsKey("LETTERS")){
                    countDL.put("LETTERS", countDL.get("LETTERS")+1);
                }else{
                    countDL.put("LETTERS", 1);
                }
            }
        }
        return countDL;
    }//Eof func

    public static void main(String[] args){
        MP13 mp13 = new MP13("Sangmyung University 2020");
        Map<String, Integer> map = mp13.countDigitsAndLetters();
        System.out.println(map);
    }
}
