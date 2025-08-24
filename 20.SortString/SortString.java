import java.util.*;
public class SortString {
    public static void main(String[] args) {
        String str = "banana";
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sortedArray=new String(charArray);
        System.out.println("Sorted string: " + sortedArray);
    }
}
