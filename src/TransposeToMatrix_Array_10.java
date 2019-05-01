public class TransposeToMatrix_Array_10 {
    //a 2-D array and WAP to transpose a matrix.
    // (row value should be transposed to column and column value should be printed in row)
    public static void main(String[] args) {
        int original[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Printing matrix without transpose:");
        for (int a=0;a<3;a++){
            for (int b=0;b<3;b++){
                System.out.print(original[a][b] +" ");
            }
            System.out.println();
        }
        System.out.println("Printing matrix after transpose");
        for (int a=0;a<3;a++){
            for (int b=0;b<3;b++){
                System.out.print(original[b][a] +" ");
            }
        }

    }



}
