package Practice_Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class find_duplicates_elements {
    
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,3,1,2,2,3,4,5,5,6,4,2,1,11,22,11};
        List<Integer> numbers = Arrays.asList(1,2,2,3,4,3,1,2,2,3,4,5,5,6,4,2,1,11,22,11);


        Set<Integer> uniqueElements = new HashSet<> ();
        Set<Integer> duplicates = new HashSet <>();
        Map<Integer,Integer> frequency = new HashMap<>();

        for (Integer number : numbers){
            if(!uniqueElements.add(number)){
                duplicates.add(number);
            }
        }
        System.out.println(duplicates);
        System.out.println(uniqueElements);


        for(int fre : arr){
            frequency.put(fre, frequency.getOrDefault(fre, 0)+1);
        }

        System.out.println(frequency);

        // //Remove Duplicates

        // Set <Integer> newDuplicates = new HashSet<>(numbers);
        // List<Integer> removeDuplicates = new ArrayList<>(newDuplicates);

        // System.out.println(removeDuplicates);
        
    }
    //for(Integer num : numbers)
    //if(!uniqueElements.add(number)){
        //(duplicates.add(number))
   // }
}
