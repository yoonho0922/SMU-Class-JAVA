package week15_finals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountWord extends WordList {
    private String[] nw;    //not word
    private ArrayList<Object> mapList = new ArrayList<>();
    private Map<String,Integer> map = new HashMap<String, Integer>();

    public CountWord(String str, char[] separs, String[] nw){
        super(str, separs);
        this.nw = nw;
    }

    //split and count method
    public void countWord(){
        boolean isWord = true;

        super.addList();

        for(String w : list){

            //Is w all digit?
            if(onlyDigit(w)) {
                continue;
            }
            //Is word notWord?
            for(String s : nw){
                if(w.equals(s))
                    isWord = false;
            }

            if(isWord){ //w is word
                putMap(w);  //put word to Map
            }

            isWord = true;
        }//Eof for loop
    }

    private boolean onlyDigit(String w){
        char[] chars = w.toCharArray();
        for(char c : chars){
            if(Character.isLetter(c))
                return false;   //word has digit
        }
        return true;    //word consist of only digit
    }

    private void putMap(String w){
        if(map.containsKey(w)){
            map.put(w, map.get(w)+1);
        }else {
            map.put(w, 1);
        }
    }

    //print entry when value is more than n
    public void showCount(int n){
        for(Map.Entry<String, Integer> e : map.entrySet()){
            if(e.getValue() >= n){
                System.out.println(e.getKey()+":"+e.getValue());
            }
        }
    }
}
