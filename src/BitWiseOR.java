import java.util.Scanner;

public class BitWiseOR {

        static void main() {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to Bite Wise operater calculater For OR");
            System.out.print("Enter Your Number 1: ");
            int Num1 = input.nextInt();
            System.out.print("Enter  Your Number 2 : ");
            int Num2 = input.nextInt();

            int Number  = Num1 | Num2;
            System.out.println("Your Answer is : "+ Number);
        }
    }

