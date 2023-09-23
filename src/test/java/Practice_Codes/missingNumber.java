package Practice_Codes;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7};
        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing no is:- "+missingNumber);
        int missingNumber2 = findMissingNumber2(arr);
    }
    
    public static int findMissingNumber(int[] arr){
        int  n = arr.length + 1;
        int totalSum = n * (n + 1)/2; //formula for finding the sum of first n natural no
        
        int arrSum = 0;
        for( int num : arr){
            //arrSum += num;
            arrSum = arrSum + num;
        }
 
 
         return totalSum-arrSum;
    }



public static int findMissingNumber2 (int [] arr){
    int n = arr.length + 1;
    int totalSum =n * (n+1)/2;

    int arrSum = 0 ;
    for(int num : arr){
        arrSum = arrSum + num;
    }

    return totalSum - arrSum;
}
}
