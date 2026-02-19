import java.util.Scanner;

public class ReverceTheDigit {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse The Digit ");
        System.out.println("Enter the Number: ");
        int num=input.nextInt();
        int reverse =reverse( num);
        System.out.println("your answer is : "+reverse);

    }
     public static int reverse(int num){
        int newNum =0;
        while(num>0){
            int digit= num%10;
            newNum=newNum*10+digit;
            num/=10;
        }
        return newNum;

    }
}
