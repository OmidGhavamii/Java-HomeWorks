package project;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.println("");
        System.out.println("Enter the value of a:");
        a = input.nextInt();
        System.out.println("Enter the value of b:");
        b = input.nextInt();
        int x = (a + b);
        int y = (a - b);
        int z = (a * b);
        int w = (a / b);
        System.out.println("PLus is : " + x);
        System.out.println("Minus is : " + y);
        System.out.println("Multiplication is : " + z);
        System.out.println("Division is : " + w);
    }
}

