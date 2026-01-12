import java.util.Scanner;

public class SubOfTwoNum{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("enter your first  num: ");
    int firstnum = input.nextInt();
    System.out.print(" enter your second num: ");
    int secondnum = input.nextInt();
    int sub = firstnum- secondnum;
    System.out.println("your answer is : " + sub);

}

}
