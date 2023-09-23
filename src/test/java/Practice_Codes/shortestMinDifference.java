package Practice_Codes;

import java.util.Arrays;

public class shortestMinDifference {
    public static void findClosestTwoNumbers(int[] arr) {
        Arrays.sort(arr);

        int minDifference = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;

        for (int i = 1; i < arr.length; i++) {
            int currentDifference = arr[i] - arr[i - 1];

            if (currentDifference < minDifference) {
                minDifference = currentDifference;
                num1 = arr[i - 1];
                num2 = arr[i];
            }
        }

        System.out.println("Closest two numbers: " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        int[] arr = {7, 12, 3, 18, 5, 20};

        findClosestTwoNumbers(arr);
    }
}

