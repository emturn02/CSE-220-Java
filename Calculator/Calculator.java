package Calculator;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        int userResult;
        int firstUserNum;
        int secUserNum;

        System.out.println("\t\t\t\t\t Calculator");
        System.out.println("\t\t\t\t\t[0] Addition");
        System.out.println("\t\t\t\t\t[1] Subtraction");
        System.out.println("\t\t\t\t\t[2] Multiplication");
        System.out.println("\t\t\t\t\t[3] Division");
        System.out.println("\t\t\t\t\t[4] Modulus");

        System.out.println("Choose an option: ");
        userChoice = scanner.nextInt();

        switch(userChoice)
        {
            case 0:
                System.out.println("\nEnter the first number: ");
                firstUserNum = scanner.nextInt();
                System.out.println("Enter the second number: ");
                secUserNum = scanner.nextInt();
                userResult = addition(firstUserNum, secUserNum);
                System.out.println(firstUserNum + " + " + secUserNum + " = " + userResult);
                break;
            case 1:
                System.out.println("\nEnter the first number: ");
                firstUserNum = scanner.nextInt();
                System.out.println("Enter the second number: ");
                secUserNum = scanner.nextInt();
                userResult = subtraction(firstUserNum, secUserNum);
                System.out.println(firstUserNum + " - " + secUserNum + " = " + userResult);
                break;
        }
    }

    private static int addition(int a, int b)
    {
        return a + b;
    }

    private static double addition(double a, double b)
    {
        return a + b;
    }

    private static int subtraction(int a, int b)
    {
        return a - b;
    }

    private static double subtraction(double a, double b)
    {
        return a - b;
    }

    private static int multiplication(int a, int b)
    {
        return a * b;
    }

    private static double multiplication(double a, double b)
    {
        return a * b;
    }

    private static int division(int a, int b)
    {
        return a / b;
    }

    private static double division(double a, double b)
    {
        return a / b;
    }

    private static int modulus(int a, int b)
    {
        return a % b;
    }
}
