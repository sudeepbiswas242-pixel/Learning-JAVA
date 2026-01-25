import java.util.Scanner;

public class BitWiseOddEven {
    static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bit wise odd or even Chack Calculator");
        System.out.print("Enter Your Number : ");
        int Num= input.nextInt();

        if(( Num &1 ) ==1){
            System.out.println("It is a Odd Number ");
        }
        else {
            System.out.println("It  is a Even Number ");
        }

    }
}
