public class MaxNumber {
    public static void main(String[] args) {
        findMax(12, 25);
    }

    public static void findMax(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }
    }
}

