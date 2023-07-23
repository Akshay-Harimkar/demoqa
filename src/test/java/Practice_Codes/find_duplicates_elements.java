package Practice_Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class find_duplicates_elements {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,2,3,4,3,1,2,2,3,4,5,5,6,4,2,1,11,22,11);


        Set<Integer> uniqueElements = new HashSet<> ();
        Set<Integer> duplicates = new HashSet <>();


        for (Integer number : numbers){
            if(!uniqueElements.add(number)){
                duplicates.add(number);
            }
        }
        System.out.println(duplicates);


        //Remove Duplicates

        Set <Integer> newDuplicates = new HashSet<>(numbers);
        List<Integer> removeDuplicates = new ArrayList<>(newDuplicates);

        System.out.println(removeDuplicates);


    }
}
