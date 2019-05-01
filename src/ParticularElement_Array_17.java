import java.util.ArrayList;

public class ParticularElement_Array_17 {
    //to get the position of a particular element in an ArrayList?
    public static void main(String[] args) {

        // create an empty array list with an initial capacity
        ArrayList<String> arrlist = new ArrayList<String>(5);

        // use add() method to add values in the list
        arrlist.add("A");
        arrlist.add("B");
        arrlist.add("C");
        arrlist.add("D");

        System.out.println("Size of list: " + arrlist.size());

        // let us print all the values available in list
        for (String value : arrlist) {
            System.out.println("Element = " + value);
        }

        // retrieving the index of element "E"
        int retval = arrlist.indexOf("E");
        System.out.println("The element E is at index " + retval);
    }
}
