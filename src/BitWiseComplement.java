import java.util.Scanner;

public class BitWiseComplement {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Compliment Calculator");
        System.out.print("Enter  Your  Number : ");
        int num1 = input.nextInt();


        int num = ~num1;
        System.out.print("your answer is : "+num);
    }
}

