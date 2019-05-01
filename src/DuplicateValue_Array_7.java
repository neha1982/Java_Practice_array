public class DuplicateValue_Array_7 {
    //a Java program to find the duplicate values of an array of integer values.
    public static void main(String[] args) {
        int[] duplicate = {1, 2, 5, 5, 6, 6, 7, 2};// duplicate value5 and 6 will be shown

        for (int i = 0; i < duplicate.length - 1; i++) {
            for (int j = i + 1; j < duplicate.length; j++) {
                if ((duplicate[i] == duplicate[j]) && (i != j)) {
                    System.out.println("Duplicate Element : " + duplicate[j]);
                }
            }
        }
    }
}
