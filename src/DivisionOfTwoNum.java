import java.util.Scanner;

public class DivisionOfTwoNum {
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(" enter your first num: ");
        int firstnum = input.nextInt();
        System.out.print("enter your second num: ");
        int secondnum = input.nextInt();
        int divison = firstnum/secondnum;
        System.out.print(" your anser is: "+ divison);
    }
}
