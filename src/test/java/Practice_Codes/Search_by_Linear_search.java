package Practice_Codes;

import java.util.Arrays;

//Input: arr[] = [5, 1, 1, 9, 7, 2, 6, 10], key = 7
//Output: true


public class Search_by_Linear_search {
   //Linear Search 
    private static void check(int [] arr, int toCheckValue){


            boolean test = false;
            for(int element : arr){
                if (element == toCheckValue){
                test = true;
                break;}
            }

           System.out.println("Is \""+toCheckValue+"\" is present in the array = "+test);
    }

        public static void main(String[] args) {
            
            int [] arr = {5, 1, 1, 9, 7, 2, 6, 10};

            int toCheckValue = 7;

            System.out.println("Arrays :"+ Arrays.toString(arr));

            check(arr, toCheckValue);


        }


        


}
