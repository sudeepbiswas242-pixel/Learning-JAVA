import java.util.Scanner;

public class Relation {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Driving Licence Portal");
        System.out.print("Enter Your Age : ");
        int Age = input.nextInt();

        if (Age>=18){
            System.out.println("You Are Eligible For Apply Licence");
        }
        else {
            System.out.println("You Are Not Eligible For Applying Licence");
        }
    }
}
