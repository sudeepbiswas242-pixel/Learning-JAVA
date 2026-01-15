import java.util.Scanner;

public class FlotingPointNum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter your first num: ");
        float firstnum = input.nextFloat();
        System.out.print("Enter your second num : ");
        float secondnum = input.nextFloat();
        float mul = firstnum * secondnum;

        System.out.println("your answer is :" + mul);

    }
}
