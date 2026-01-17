import java.util.Scanner;

public class FahrenheitToCelsius {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fahrenheit to Celsius Calculater: \n");
        System.out.print(" Enter The value of Fahrenheit : ");
        float Fahrenheit = input.nextFloat();
        float Celsius = (Fahrenheit -32 )*5/9;
        System.out.println("Celsius is : "+ Celsius +"C");
    }
}
