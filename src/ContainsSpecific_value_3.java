import java.util.Scanner;

public class ContainsSpecific_value_3 {
    //Java program to test if an array contains a specific value.
    public static boolean contains(int[] arr, int item){

        for (int n: arr){ //array = number list
            if (item==n){ // item = specific value to find out
                return true; //boolean condition
            }
        }
        return false; //boolean condition
    }
    //main method
    public static void main(String[] args) {
        int  []array1 = {

                2019, 2018, 1988, 2017, 1876};
        System.out.println(contains(array1, 2022));
        System.out.println(contains(array1, 2019));
    }




}


