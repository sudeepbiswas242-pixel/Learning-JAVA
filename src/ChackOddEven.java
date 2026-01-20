import java.util.Scanner;

public class ChackOddEven {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Chack odd and even number calculater");
        System.out.print("Enter Your Number : ");
        int Number = input.nextInt();

        if (Number % 2 == 0){
            System.out.println("It is a Even Number ");
        }
        else {
            System.out.println("it is a Odd Number");
        }
    }
}
