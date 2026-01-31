import java.util.Scanner;
public class MultiplicationTable {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table\n");
        System.out.println("Enter Your Number: ");
        int num= input.nextInt();
       Multiplication(num);
    }
    public static void Multiplication(int num){
        int i=1;
        while (i<=10){
            System.out.println(num+"x"+i+"="+(num*i));
            i++;
        }



    }
}
