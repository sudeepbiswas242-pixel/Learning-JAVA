import java.util.Scanner;

public class ArmstrongNum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number ");
        System.out.print("Enter Your Number: ");
        int num=input.nextInt();
        boolean isArmstrong=isArmstrong(num);
        if(isArmstrong){
            System.out.println("your  number is Armstrong");
        }
        else {
            System.out.println("your number is not Armstrong");
        }

    }
    public static boolean isArmstrong(int num){
        int noOfDigit=noOfDigit(num);
        int numcopy=num;
        int finalNumber=0;
        while (num>0){
            int lastDigits= num%10;
            num /=10;
            finalNumber+=pow(lastDigits,noOfDigit);
        }
        return finalNumber==numcopy ;
    }
    public  static int pow(int num1,int num2){
        int result = 1;
        int i=0;
        while (i<num2){
            result*= num1;
            i++;
        }


        return result;
    }
    public static int noOfDigit(int num){
        int digit=0;
        while (num>0){
            digit++;
            num /=10;
        }
        return digit;
    }


}
