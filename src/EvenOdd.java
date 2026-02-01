public class EvenOdd {
    public static void main(String[] args) {
        checkEvenOdd(7);   // function call
    }

    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}

