import java.util.Scanner;

public class RightShift {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Right Shift Calculator");
        System.out.print("Enter Your  Number : ");
        int num1 = input.nextInt();


        int num = num1>>1;
        System.out.print("your answer is : "+num);
    }
}

