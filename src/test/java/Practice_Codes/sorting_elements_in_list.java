package Practice_Codes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sorting_elements_in_list {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Akshay","Shivam","lokesh","pavan","vishal","zero","shubham");

        Collections.sort(words);

        System.out.println("Sorted words "+words);
    }
    
}
