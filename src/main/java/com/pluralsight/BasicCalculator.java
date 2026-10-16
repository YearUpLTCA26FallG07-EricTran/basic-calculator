package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //number 1
        System.out.print("Enter your first number: ");
        int num1 = scanner.nextInt();
        //number 2
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        //operations
        System.out.println("Possible calculations: ");
        System.out.println("    (A)dd");
        System.out.println("    (S)ubtract");
        System.out.println("    (M)ultiply");
        System.out.println("    (D)ivide");
        System.out.println("Please select an option: ");

        // calculate the results
        int result = num1 * num2;

        //display output
        System.out.println(num1 + " * " + num2 + " = " + result);




    }

}
