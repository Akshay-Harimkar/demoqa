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

        // Scanner scanner  = new Scanner(System.in);
        // System.out.println("Enter the total count of no :");
        // int n = scanner.nextInt();


        // double [] numbers = new double [n];
        // for(int i=0; i<n;i ++){
        //     System.out.println("Enter next no :"+(i + 1)+" ");
        //     numbers[i] = scanner.nextDouble();
        // }
        // scanner.close();

        // double sum=0;
        // for(double num : numbers){
        //      sum += num; //sum = sum + num
        // }

        // double average = sum/n;
        // System.out.println("Average :- "+average);





        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the value :-");
        int n2 = scanner2.nextInt();

        double[] num = new double[n2];
        for(int i = 0;i<n2;i++){
            System.out.println("Enter the next no "+(i+1)+" ");
            num[i] = scanner2.nextDouble();
        }
        scanner2.close();

        double sum2 = 0;
        for (double no : num){
            sum2 += no;
        }

        double average2= sum2/n2;
        System.out.println("Average is :"+average2);


     }

}
