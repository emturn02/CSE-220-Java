import java.util.Scanner;

public class SimpleMath
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = scan.nextInt();
        System.out.println("Enter your second number: ");
        int b = scan.nextInt();
        int addResult = addition(a, b);
        int subResult = subtraction(a, b);
        int multResult = multiplication(a, b);
        System.out.println(a + " + " + b + " = " + addResult);
        System.out.println(a + " - " + b + " = " + subResult);
        System.out.println(a + " * " + b + " = " + multResult);
    }

    private static int addition(int a, int b)
    {
        return a + b;
    }

    private static int subtraction(int a, int b)
    {
        return a - b;
    }
    
    private static int multiplication(int a, int b)
    {
        return a * b;
    }
}
