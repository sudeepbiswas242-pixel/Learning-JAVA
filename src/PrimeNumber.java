import java.util.Scanner;

public class PrimeNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Chack Calculator");
        System.out.print("Please Enter Your Number: ");
        int Num= input.nextInt();
        boolean prime=prime(Num);
        if(prime){
            System.out.println("your number is prime number");
        }
        else{
            System.out.println("your number is not prime number ");
        }

    }
    public static boolean prime(int num){
        int i =2;
        while (i<num){
            if(num%i==0) {
                return false;
            }
            i++;

        }
        return true;

    }

}
