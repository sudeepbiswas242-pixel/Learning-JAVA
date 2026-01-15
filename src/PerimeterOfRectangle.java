import java.util.Scanner;

public class PerimeterOfRectangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the value of A : ");
        double A = input.nextDouble();
        System.out.print(" Enter the valueof B : ");
        double B = input.nextDouble();
        System.out.print(" Enter the value of C : ");
        double C = input.nextDouble();
        System.out.print(" Enter the value of D: ");
        double D = input.nextDouble();
         double Perimeter = A+B+C+D;
        System.out.println("your answer is : " + Perimeter+"cm");
    }
}
