import java.util.Scanner;

public class GCD {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GCD Calculator");
        System.out.println("Enter Your First Num: ");
        int firstnum= input.nextInt();
        System.out.println("Enter your second Num: ");
        int secondnum= input.nextInt();
        int gcd=gcd(firstnum,secondnum);
        System.out.println("Your answer is : "+gcd);


    }
    public static int gcd(int firstnum , int  secondnum) {
        int gcd = 1;
        int i = 2;
        int least = least(firstnum, secondnum);
        while (i <= least) {
            if (firstnum % i == 0 && secondnum % i == 0)
            {
                gcd = i;
            }
            i++;


        }
        return gcd;
    }

    public static int least(int firstnum ,int secondnum){
        if(firstnum<secondnum){
            return firstnum;

        }
        else {
            return secondnum;
        }
    }


}
