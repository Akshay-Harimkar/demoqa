package Practice_Codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class common_elements {
    
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,5,3,5,2);
        List<Integer> list2 = Arrays.asList(2,3,1,3,44);

        Set<Integer> commonNumbers = new HashSet<> (list1);

        commonNumbers.retainAll(list2);
        System.out.println(commonNumbers);





    }
}
