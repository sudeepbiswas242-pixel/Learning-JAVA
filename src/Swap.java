import java.util.Scanner;

public class Swap {
    static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("welcome to swaping station");
        System.out.print("enter value of A: ");
        int a = input.nextInt();
        System.out.print("enter value of B: ");
        int b =input.nextInt();
        int c =a;
         a =b;
         b =c;
        System.out.println("after swap value of A: " + a);
        System.out.println(" after swap value of B: " + b);

    }
}
