import java.util.ArrayList;

public class Compair_javaArrayList_15 {
    //Write a Java program to compare two array lists
    public static void main(String[] args) {
        //arraylist first one compare to other list
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("JavaFx");
        list1.add("Java");
        list1.add("WebGL");
        list1.add("OpenCV");
        //arraylist 2 compare with first list
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("JavaFx");
        list2.add("Java");
        list2.add("WebGL");
        list2.add("OpenCV");
        System.out.println(list2);
        System.out.println(list1.equals(list2));
    }
}
