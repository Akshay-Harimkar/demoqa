package Practice_Codes;

public class largestSumOfConsecutiveIntegers {

    public static int findLargestSum(int arr []){
        if(arr == null || arr.length == 0){
        return 0;
    }

    int curentMax = arr[0];
    int globalMax = arr[0];

    for (int i=1;i<arr.length;i++){

        curentMax = Math.max(arr[i], curentMax + arr[i]);

        globalMax = Math.max(globalMax, curentMax);


    }

    return globalMax;


    }
    

    public static void main(String[] args) {
        int array [] ={1,-3,-4,-2,7,-5,8};//it works on kaden's algorithm
        int result = findLargestSum(array);
        System.out.println(result);


    }


    
}
