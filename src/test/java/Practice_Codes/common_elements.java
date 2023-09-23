package Practice_Codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class common_elements {
    
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,5,3,5,2);
        List<Integer> list2 = Arrays.asList(2,3,1,3,44);
        List<Integer> list3 = Arrays.asList(3,2,1,44,5,3,4);

        Set<Integer> commonNumbers = new HashSet<> (list1);
        commonNumbers.retainAll(list2);
        
        Set<Integer> commonNumbers2 = new HashSet<>(list2);
        commonNumbers2.retainAll(list3);
        

        System.out.println(commonNumbers);
        System.out.println(commonNumbers2);




    }
}
