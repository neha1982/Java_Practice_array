import java.util.ArrayList;

public class IndexofElement_4 {
    //Java program to find the index of an array element.
    public static int findIndex(int[]array,int t){
        //array is null
        if(array == null) return -1;
        //find length of value
        int len = array.length;
        int i = 0;
        while (i<len){
            if(array[i]==t)

                return i;
            else
                i=i+1;
        }
        return -1;
    }
    //main method
    public static void main(String[] args) {
        int[] array = {34, 45, 64, 22, 11, 87, 66};

        //now find the index of 11
        System.out.println("Index position of 11 is: " + findIndex(array, 11));
    }

}
