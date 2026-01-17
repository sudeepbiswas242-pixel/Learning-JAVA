import java.util.Scanner;

public class CompoundInterest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to compound interest calculater\n");
        System.out.print("Enter the value of Principle Rs : ");
        int Principle = input.nextInt();
        System.out.print("Enter the value of Rate of Interest: ");
        float RateOfInterest = input.nextFloat();
        System.out.print(" Enter the Time year : ");
        float Time = input.nextFloat();
        double Interest = Principle * Math.pow((1+RateOfInterest/100 ),Time);
        System.out.print("The Compound Interest is : "+Interest);
    }
}
