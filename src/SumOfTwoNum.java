import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to our calculater");
        System.out.print("enter First Number: ");
        int FirstNum = input.nextInt();
        System.out.print("enter second number: ");
        int SecondNum = input.nextInt();
        int sum =  FirstNum + SecondNum;
        System.out.println("your answer: "+ sum);
    }
}
