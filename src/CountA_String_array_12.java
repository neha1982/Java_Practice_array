public class CountA_String_array_12 {
    //WAP to enter any String and count total number of 'a' in that String

    static int countOccurrence(String b, char ch) {
        int count = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == ch) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOccurrence("annabella", 'a'));
    }
}