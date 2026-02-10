import java.util.Scanner;

public class ChackLeapYear {
    public static void main( String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to leap year calculater ");
        System.out.print("Enter the year : ");
        int Year = input.nextInt();

        if(Year % 400 ==0){
            System.out. print("Year is Leap year ");

        }
        else if (Year % 100 ==0 ) {
            System.out.println("Year is not Leap year");
        }
        else if (Year % 4 ==0){
            System.out.println("Your year is Leap year");
        }
        else {
            System.out.println("Your year is not leapyear");
        }
    }
}
