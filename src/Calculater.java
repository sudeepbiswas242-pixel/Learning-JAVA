import java.util.Scanner;

public class Calculater {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Calculater");
        System.out.print("enter your first num: ");
        int firstnum = input.nextInt();
        System.out.print("enter your second num: ");
        int secondnum = input.nextInt();
        int sum = firstnum + secondnum ;
        int sub = firstnum -  secondnum;
        int mul = firstnum * secondnum;
        int div = firstnum/secondnum;
        int modu=  firstnum%secondnum;
        System.out.println(" sum=  " + sum);
        System.out.println(" sub= " +sub);
        System.out.println(" mul ="+ mul);
        System.out.println(" div =" + div);
        System.out.println(" modu= "+ modu);


    }
}
