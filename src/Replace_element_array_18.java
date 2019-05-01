import java.util.ArrayList;

public class Replace_element_array_18 {

    //to replace a particular element in an ArrayList with the given element?
    public static void main(String[] args) {
        //creat object
        ArrayList<String> colours = new ArrayList<>();
        //creat colour list
        colours.add("White");
        colours.add("Fuchsia");
        colours.add("Gold");
        colours.add("Royal Blue");
        colours.add("Silver");
        // to replace colour gold to black
        System.out.println("arraylist before replace: "+ colours);
        colours.set(2, "Black"); //index any no. which is in the above list, can replace with colour

        System.out.println("ArrayList after replace " + colours);

    }
}
