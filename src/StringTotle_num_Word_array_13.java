public class StringTotle_num_Word_array_13 {

    //WAP to enter any String and count how many total number of words and total number of spaces in that sentence
    public static void main(String...s)
    {
        int word=1;
        String str="count number of words and sapces";

        for(int i=0;i<str.length();++i)
        {
            if(str.charAt(i)==' ')
                word++;
        }

        System.out.println("Number of words="+word);
        System.out.println("Number of spaces="+(word-1));
    }
}
