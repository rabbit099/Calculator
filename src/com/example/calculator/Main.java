package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int result = 0;
        int number1 = 0;
        int number2 = 0;
            System.out.println("Hello");
            System.out.println("This is calculator");
            System.out.println("Choose a option:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            Scanner input= new Scanner(System.in);
            int option = input.nextInt();
            switch(option)
            {
                case 1:
                    System.out.println("You choosed Addition");
                    System.out.println("Type your numbers");
                    System.out.print("Number 1: ");
                    number1 = input.nextInt();
                    System.out.print("Number 2: ");
                    number2 = input.nextInt();
                    result = number1 + number2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    System.out.println("You choosed Substraction");
                    System.out.println("Type your numbers");
                    System.out.print("Number 1: ");
                    number1 = input.nextInt();
                    System.out.print("Number 2: ");
                    number2 = input.nextInt();
                    result = number1 - number2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    System.out.println("You choosed Multiplication");
                    System.out.println("Type your numbers");
                    System.out.print("Number 1: ");
                    number1 = input.nextInt();
                    System.out.print("Number 2: ");
                    number2 = input.nextInt();
                    result = number1 * number2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    System.out.println("You choosed Division");
                    System.out.println("Type your numbers");
                    System.out.print("Number 1: ");
                    number1 = input.nextInt();
                    System.out.print("Number 2: ");
                    number2 = input.nextInt();
                    result = number1 % number2;
                    System.out.println("Result: " + result);
                    break;
            }
        }
}
