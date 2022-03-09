package project;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("How many score of lessons you want to enter?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double total = 0;

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter score lessons No."+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }



        double average = total / arr.length;

        System.out.format("The average of the score of lessons is equal to : %.3f", average);

        if(average>10) {

            System.out.println("\nYou passed the lessons!");
        }
        else
        {
            System.out.println("\nYou were not accepted the lessons!");
        }

    }
}

