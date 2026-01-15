import java.util.Scanner;

public class AreaOfTriangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Calculate Area of Triangle");
        System.out.print(" Enter the value of Breath : ");
        double Breath = input.nextDouble();
        System.out.print(" Enter the value of height : ");
        double height = input.nextDouble();
        double area = 0.5*Breath*height; // 1/2 = 0.5
        System.out.println(" your answer is : "+ area+"cm");

    }
}
