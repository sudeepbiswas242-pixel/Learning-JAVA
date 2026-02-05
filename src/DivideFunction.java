import java.util.Scanner;

public class DivideFunction {

    // Function to divide two numbers
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double result = divide(num1, num2);

        System.out.println("Result = " + result);
    }
}

