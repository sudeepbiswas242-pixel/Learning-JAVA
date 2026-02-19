import java.util.Scanner;

public class ChackNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Chack Calculater");
        System.out.print("Enter your number: ");
        int Number = input.nextInt();


        if(Number > 0){
            System.out.println("It is a Positive Number ");
        }
        else if(Number ==0){
            System.out.println("Your number is Zero ");
        }
        else {
            System.out.println("It is a Negative Number");
        }
    }
}
