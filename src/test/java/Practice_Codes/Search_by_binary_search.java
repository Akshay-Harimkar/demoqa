package Practice_Codes;

import java.util.Arrays;

public class Search_by_binary_search {


    private static void check2 (int [] arr2, int toCheckValue2){

        Arrays.sort(arr2);


        int res = Arrays.binarySearch(arr2, toCheckValue2);

        boolean test = res >= 0 ? true:false; // it checks the value of res if it is greater than or equal to 0 then true will be assigned to test or it can be false

        System.out.println("Is \""+toCheckValue2+"\"is present in the Array = "+test);


    }

    public static void main(String[] args) {
        int [] arr2 = { 5, 1, 1, 9, 7, 2, 6, 10 };

        int toCheckValue2 = 15;

        //System.out.println("arrays "+Arrays.toString(arr2));

        check2(arr2, toCheckValue2);
        System.out.println(Arrays.toString(arr2));
    }


    
}
