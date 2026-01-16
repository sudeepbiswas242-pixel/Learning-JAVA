import java.util.Scanner;

public class SimpleInterest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Simple Interest");
        System.out.print(" Enter the value of Principle RS: ");
        int Principle = input.nextInt();
        System.out.print("Enter the value of Rate :  ");
        float Rate = input.nextFloat();
        System.out.print(" Enter the value of Time: ");
        float Time = input.nextFloat();
        float Interest = (Principle*Rate*Time)/100;
        System.out.print(" The Simple Interest is : "+Interest);

    }
}
