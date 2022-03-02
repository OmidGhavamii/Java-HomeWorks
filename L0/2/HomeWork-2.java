package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.println("Enter Entegers=");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int num3 = input.nextInt();


        if(num1 >= num2) {

            if(num1 >= num3)
                System.out.println(num1+" is the largest Number");
            else
                System.out.println(num3+" is the largest Number");
        }
        else {

            if (num2 >= num3)
                System.out.println(num2 + " is the largest Number");
            else
                System.out.println(num3 + " is the largest Number");
        }
    }
}

