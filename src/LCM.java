import java.util.Scanner;
public class LCM {
    static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.println("Please Enter Your Number :");
        int firstnum=input.nextInt();
        System.out.println("Please Enter Your Second Number: ");
        int secondnum=input.nextInt();
        int lcm=lcm(firstnum,secondnum);
        System.out.println("your answer is : "+lcm);
    }
    public static int lcm(int firstnumber, int secondnumber){
        int i=1;
        while(i<=secondnumber){
            int factor = firstnumber *i;
            if(factor % secondnumber==0){
                return factor;
            }
            i++;

        }
        return 0;
    }
}
