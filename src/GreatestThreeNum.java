import java.util.Scanner;
public class GreatestThreeNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Greatest Three Number Calculate Calculater ");
        System.out.print("Enter your first num: ");
        int firstNum = input.nextInt();
        System.out.print("Enter Second num: ");
        int secondnum = input.nextInt();
        System.out.print("Enter Third Num : ");
        int thirdnum = input.nextInt();


        if(firstNum >= secondnum && firstNum >= thirdnum ){
            System.out.println( firstNum + " is  Greatest num: ");
        }
        else if (secondnum >= firstNum && secondnum >= thirdnum){
            System.out.println( secondnum+ " is Greatest num");
        }
        else {
            System.out.println(thirdnum+" is greatest num");
        }


    }

}
