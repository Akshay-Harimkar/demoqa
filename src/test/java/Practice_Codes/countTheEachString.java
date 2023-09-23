package Practice_Codes;

import java.util.HashMap;
import java.util.Map;

public class countTheEachString {
    public static void main(String[] args) {
    //     String str = "aaabbbbbaccc";

    //     Map<Character , Integer> currentCharMap = new HashMap<>();

    //     for(int i =0; i < str.length();i++){
    //         char currenctCharCount = str.charAt(i);

    //         currentCharMap.put(currenctCharCount, currentCharMap.getOrDefault(currenctCharCount,0)+1);

    //     }


    //     for (Map.Entry<Character, Integer> entry : currentCharMap.entrySet() ){
    //         System.out.println("Character :"+entry.getKey()+" Count is : " + entry.getValue());
    //     }


    // Map<Character, Integer> currentChar = new HashMap<>();

    // for(int i =0;i< str.length();i++){
    //     char countChar = str.charAt(i);
    // currentChar.put(countChar, currentChar.getOrDefault(countChar, 0)+1);
    // }

    // for(Map.Entry<Character,Integer> entry : currentChar.entrySet()){
    //     System.out.println(entry.getKey()+" " +entry.getValue());
    // }
    String str = "The best friends forever";
           

    Map<Character, Integer> count = new HashMap<> ();
      
    for(int i =0 ; i<str.length();i++){
        char countChar = str.charAt(i);
    count.put(countChar, count.getOrDefault(countChar , 0)+1);
    }

    for(Map.Entry<Character, Integer> entry: count.entrySet()){
        System.out.println(entry.getKey()+" = "+entry.getValue());
    }


    }

    
}
