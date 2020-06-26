package week15_finals;

import java.util.ArrayList;

public class WordList {
    protected ArrayList<String> list = new ArrayList<>();
    protected String str;
    protected char[] separs;

    public WordList(String str, char[] separs){
        this.str = str;
        this.separs = separs;
    }

    //split and add list method
    public void addList(){

        int i = 0;
        boolean isSep = false;
        char[] words = str.toCharArray();
        StringBuilder word = new StringBuilder();

        //words to lower case
        words = ConvertChars.toLowerCase(words);

        for(char c : words){
            //Is c separator?
            for(char sep : separs){
                if(c == sep)
                    isSep = true;
            }

            if(isSep){  //c is separator
                if(word.length()!=0){
                    list.add(word.toString());
                    word.delete(0,word.length());
                }
                isSep = false;
            }else{  //c is not separator
                word.append(c);
            }
            i++;
            //exception when c is end of words
            if(i == words.length){
                list.add(word.toString());
            }
        }//Eof for loop
    }

    public void showList(){
        System.out.println(list.toString());
    }
}
