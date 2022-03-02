package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.println("Enter Entegers=");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

        Scanner reader=new Scanner(System.in);
        System.out.print("Enter Number :\nHint:\n(Number 1 is +) (Number 2 is -) (Number 3 is *) (Number 2 is /) \n");
        int num=reader.nextInt();
        switch(num){
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Error");
                break;

        }
    }
}
