import java.util.Scanner;

public class AgeGroup {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to age Group Calculator ");
        System.out.print("Enter Your age: ");
        int age = input.nextInt();

        if(age <= 13){
            System.out.println("You are a children");
        }
        else if (age<=20) {
            System.out.println("You are teenager");
        }
        else if(age<=60){
            System.out.println("You are Adult");
        }
        else {
            System.out.println("you are Senior");
        }
    }
}
