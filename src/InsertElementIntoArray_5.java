import java.util.Scanner;

public class InsertElementIntoArray_5 {
    public static void main(String[] args) {
        int len,p,ele;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter lenght of array: ");

        len = sc.nextInt();

        int arr[]= new int[len+1];

        System.out.println("Enter "+len+" elements:");
        for (int i=0; i<len; i++){

            arr[i] =sc.nextInt();
        }
        System.out.print("Enter element which you want to Insert: ");
        ele = sc.nextInt();
        arr[len]=ele;
        System.out.print("After Insert element: ");
        for (int i=0; i<len; i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[len]);


    }
}
