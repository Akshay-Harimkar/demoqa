package Practice_Codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union_intersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,7,8));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Union : "+union);
        System.out.println("Intersection : "+intersection);
    }
}
