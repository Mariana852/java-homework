package ClassAge;

import java.util.Arrays;

public class LongestWord {

    public static void main(String[] args) {
        System.out.println(LongestWord(" The longest word "));
    }

    public static String LongestWord(String str){
        String[] words = str.split(" ");
        int index = 0;
        for(int i = 0; i < words.length; ++i){
            final String current = words[i];
            if(current.length() > words[index].length()){
                index = i;
            }
        }
        return words[index];
    }
    }


