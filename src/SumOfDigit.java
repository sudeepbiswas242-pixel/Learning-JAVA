import java.util.Scanner;

public class SumOfDigit {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Sum of Digit Calculator");
        System.out.println("Enter your number");
        int num=input.nextInt();
        int sum=SumOfDigit(num);
        System.out.println("Sum of digit is: "+sum);
    }
    public static int SumOfDigit(int num){
        int sum =0;
        while(num>0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }
}
