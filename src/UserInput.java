import java.util.Scanner;

public class UserInput {
    static void main(String[] args) {
        System.out.print("Please enter your name: ");
        Scanner input= new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("welcome\t" +name+ "\t coding zone");

    }
}
