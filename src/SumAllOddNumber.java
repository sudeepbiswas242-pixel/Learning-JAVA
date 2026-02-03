import java.util.Scanner;

public class SumAllOddNumber {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to sum of all odd number calculater");
        System.out.println("Enter your Number: ");
        int num= input.nextInt();
        int sum=Oddsum(num);
        System.out.println("Odd sum till  "+num+"is: "+sum);
    }
    public static int Oddsum(int num){
        int sum=0;
        int i=1;
        while (i<=num){
            sum+=i;
            i +=2;
        }
     return sum;

    }

}
