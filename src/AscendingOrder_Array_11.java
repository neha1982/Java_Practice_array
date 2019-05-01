import java.util.Scanner;

public class AscendingOrder_Array_11 {
    //enter array and sort the values in ascending order
    public static void main(String[] args) {
        int[] a = new int[]{5, 2, 8, 7, 1};
        int temp = 0;

        System.out.println("Elements of original array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[1];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();

        System.out.println("Elements of array sorted in ascending order");
        for (int i = 0; i < a.length; i++) {
        }

    }
    }