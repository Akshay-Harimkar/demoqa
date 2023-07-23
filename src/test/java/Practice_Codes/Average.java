package Practice_Codes;

import java.util.Scanner;

public class Average {
    public static void main (String [] args){
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Enter the required no ");
    //     int n = scanner.nextInt();

    //     double [] numbers = new double[n];
    //     for (int i=0;i<n; i++ ){
    //         System.out.print("Element"+(i+1)+ ": ");
    //         numbers[i]= scanner.nextDouble();
            
    //     }
    //     scanner.close();



    //     double sum = 0;
    //     for (double num : numbers){
    //         sum += num;
    //     }

    //     double average = sum/n;
    //     System.out.println("Average "+average);

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the total count of no :");
        int n = scanner.nextInt();


        double [] numbers = new double [n];
        for(int i=0; i<n;i ++){
            System.out.println("Enter next no :"+(i + 1)+" ");
            numbers[i] = scanner.nextDouble();
        }
        scanner.close();

        double sum=0;
        for(double num : numbers){
             sum += num; //sum = sum + num
        }

        double average = sum/n;
        System.out.println("Average :- "+average);


     }

}
