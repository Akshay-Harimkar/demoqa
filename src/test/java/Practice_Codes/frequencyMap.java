package Practice_Codes;

import java.util.HashMap;
import java.util.Map;

public class frequencyMap {
    public static void main(String[] args) {
        String str = "akshay";
        char [] ch = str.toCharArray();
        int [] arr = {1, 2, 3, 2, 4, 3, 5, 1, 3};

        Map<Character, Integer> countChar = new HashMap<>();
         Map<Integer, Integer> frequnecyCount = new HashMap<>();


         for(char count : ch){
            countChar.put(count, countChar.getOrDefault(count, 0)+1);
         }

        for (int num : arr){
            frequnecyCount.put(num, frequnecyCount.getOrDefault(num, 0)+1);
        }

        System.out.println(countChar);
        System.out.println(frequnecyCount);


    }
}
