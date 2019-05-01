import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Reverse_array_6 {
    //Java program to reverse an array of integer values

    /* function that reverses array and stores it
       in another array*/
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(13);
        a.add(18);
        a.add(20);
        a.add(21);
        a.add(29);
        System.out.println(a);
        Collections.reverse(a);
        System.out.println(a);

    }



}
