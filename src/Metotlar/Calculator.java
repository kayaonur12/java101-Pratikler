package Metotlar;

import java.util.Scanner;



// This calculator can use previous calculations result and do subsequent calculations.



public class Calculator {
    static int plus(int a, int b) {
        int result = a + b;
        System.out.println("Result is: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Result is: " + result);
        return result;
    }

    static int multiple(int a, int b) {
        int result = a * b;
        System.out.println("Result is: " + result);
        return result;
    }

    static int division(int a, int b) {
        int result = a / b;
        System.out.println("Result is: " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++)
            result *= a;
        System.out.println("Result is: " + result);
        return result;
    }

    static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Result is: " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Result is: " + result);
        return result;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int output = 0;
        int n;
        int i = 0;
        int a;
        int b;

        do {
            System.out.print("""
                    Please select what would you like to do from below mentioned calculations.
                    1- Addition
                    2- Subtraction
                    3- Multiplication
                    4- Division
                    5- Power
                    6- Factorial
                    7- Mod
                    8- Clear
                    9- Exit
                    """);
            n = input.nextInt();
            if (i == 0) {
                i++;
                if (n == 1) {
                    System.out.print("Please indicate the first number: ");
                    a = input.nextInt();
                    System.out.print("Please indicate second number: ");
                    b = input.nextInt();
                    output = plus(a, b);
                } else if (n == 2) {
                    System.out.print("Please indicate the first number: ");
                    a = input.nextInt();
                    System.out.print("Please indicate second number: ");
                    b = input.nextInt();
                    output = minus(a, b);
                } else if (n == 3) {
                    System.out.print("Please indicate the first number: ");
                    a = input.nextInt();
                    System.out.print("Please indicate second number: ");
                    b = input.nextInt();
                    output = multiple(a, b);
                } else if (n == 4) {
                    System.out.print("Please indicate the first number: ");
                    a = input.nextInt();
                    System.out.print("Please indicate second number: ");
                    b = input.nextInt();
                    output = division(a, b);
                } else if (n == 5) {
                    System.out.print("Please indicate the base: ");
                    a = input.nextInt();
                    System.out.print("Please indicate the exponent: ");
                    b = input.nextInt();
                    output = power(a, b);
                } else if (n == 6) {
                    System.out.print("Please indicate the factorial number: ");
                    a = input.nextInt();
                    output = factorial(a);
                } else if (n == 7) {
                    System.out.print("Please indicate the number: ");
                    a = input.nextInt();
                    System.out.print("Please indicate the mod: ");
                    b = input.nextInt();
                    output = mod(a, b);
                } else {
                    i = 0;
                }
            } else {
                i++;
                if (n == 1) {
                    System.out.println("First number is: " + output);
                    a = output;
                    System.out.print("Please indicate second number: ");
                    b = input.nextInt();
                    output = plus(a, b);
                } else if (n == 2) {
                    System.out.println("First number is: " + output);
                    a = output;
                    System.out.print("Please indicate second number: ");
                    b = input.nextInt();
                    output = minus(a, b);
                } else if (n == 3) {
                    System.out.println("First number is: " + output);
                    a = output;
                    System.out.print("Please indicate second number: ");
                    b = input.nextInt();
                    output = multiple(a, b);
                } else if (n == 4) {
                    System.out.println("First number is: " + output);
                    a = output;
                    System.out.print("Please indicate second number: ");
                    b = input.nextInt();
                    output = division(a, b);
                } else if (n == 5) {
                    System.out.println("The base is: " + output);
                    a = output;
                    System.out.print("Please indicate the exponent: ");
                    b = input.nextInt();
                    output = power(a, b);
                } else if (n == 6) {
                    System.out.println("The factorial number is: " + output);
                    a = output;
                    output = factorial(a);
                } else if (n == 7) {
                    System.out.println("The number is: " + output);
                    a = output;
                    System.out.print("Please indicate the mod: ");
                    b = input.nextInt();
                    output = mod(a, b);
                } else {
                    i = 0;
                }
            }
        } while (n != 9);
        System.out.println("Thanks for using our calculator");
    }
}