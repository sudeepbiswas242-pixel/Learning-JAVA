import java.util.Scanner;

public class FunctionFacterial {

    public static void main(String[] args) {   // main must be public

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Factorial Calculator");
        System.out.print("Enter your number : ");

        int num = input.nextInt();

        long fact = factorial(num);

        System.out.println("Factorial is : " + fact); // print result
    }

    public static long factorial(int num) {

        if (num < 2) {
            return 1;
        }

        long fact = 1;
        int i = 2;

        while (i <= num) {
            fact *= i;
            i++;
        }

        return fact;
    }
}


