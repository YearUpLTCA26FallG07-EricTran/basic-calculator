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
        String option = scanner.next();

        // calculate the results
        int result = 0;
        String operator = "";

        if(option.equalsIgnoreCase("A")) {
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);

        } else if(option.equalsIgnoreCase("S")) {
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);

        } else if(option.equalsIgnoreCase("M")) {
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);

        } else if (option.equalsIgnoreCase("D")) {
            result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                        }
                    }
                }


