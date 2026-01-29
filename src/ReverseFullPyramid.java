public class ReverseFullPyramid {

    public static void main(String[] args) {
        pattern();
    }

    public static void pattern() {
        int row = 5;

        while (row > 0) {

            int space = 5 - row;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }

            int star = row;
            while (star > 0) {
                System.out.print("* ");
                star--;
            }

            System.out.println();
            row--;
        }
    }
}

