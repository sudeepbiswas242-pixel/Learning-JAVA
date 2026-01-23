import java.util.Scanner;

public class HallTicketDiscount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Hall Ticket Discount System");
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter ticket price: ");
        double price = input.nextDouble();

        double discount = 0;

        if (age <= 12) {
            discount = 0.50; // 50%
        }
        else if (age <= 18) {
            discount = 0.25; // 25%
        }
        else if (age > 60) {
            discount = 0.40; // 40%
        }
        else {
            discount = 0.0; // No discount
        }

        double finalPrice = price - (price * discount);

        System.out.println("Discount applied: " + (discount * 100) + "%");
        System.out.println("Final ticket price: ₹" + finalPrice);


    }
}

