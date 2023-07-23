package Practice_Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sort_even_odd {

    public static void main(String[] args) {

    List<Integer> input = Arrays.asList(3, 4, 5, 6, 2, 1, 7, 8, 9);

    List<Integer> evenNumbers = new ArrayList<>();
    List<Integer> oddNumbers = new ArrayList<>();


    for  (Integer num : input){
        if(num % 2 == 0){
            evenNumbers.add(num);
        }else{
            oddNumbers.add(num);
        }       
    }


    Collections.sort(evenNumbers);
    Collections.sort(oddNumbers);


    List<Integer> output = new ArrayList<>();

    output.addAll(evenNumbers);
    output.addAll(oddNumbers);

    System.out.println("Output : "+output);

}


    
}
