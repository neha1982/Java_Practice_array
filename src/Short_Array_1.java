
import java.util.Arrays;
//program to sort a numeric array and a string array.
public class Short_Array_1 {
    public static void main(String[] args) {
        int a [] = {10,8,6,4,2};
        String b[] = {"Eat", "Java", "Dream", "Java" };
        Arrays.sort(a);
        for (int i =0; i<a.length;i++){
            System.out.println(a[i]);
        }
        Arrays.sort(b);

        for (int j = 0; j<b.length;j++){
            System.out.println(b[j]);
        }

    }
}
