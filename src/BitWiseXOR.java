import java.util.Scanner;
public class BitWiseXOR {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to XOR Calculator");
        System.out.print("Enter Your First Number : ");
        int num1 = input.nextInt();
        System.out .print("Enter your second Number : ");
        int num2 =input.nextInt();

        int num = num1 ^ num2;
        System.out.print("your answer is : "+num);
    }
}
