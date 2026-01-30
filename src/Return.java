import java.util.Scanner;
public class Return {
    static void main(String[] args) {
        greed();
         int First=ReadNumber();
        int Second=ReadNumber();
        int num=First+Second;
        System.out.println("Your Answer : "+num);
    }

    public static void greed() {
        System.out.println("Welcome to our calculater");
    }

    public static int ReadNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        return num;
    }


}

