public class FunctionCallRightHalfPyramid {
    static void main(String[] args) {
        Pattern();

    }
    public static void Pattern(){
        int row=4;
        while(row>-1){
            System.out.print("*");
            int i =0;
            while (i<row){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row--;
        }
    }
}
