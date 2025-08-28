// File: 21.Anagram.java
import java.util.Arrays;

public class Anagrams {
    
    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String s1, String s2) {
        // Remove spaces and convert to lowercase for uniformity
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        // If lengths are different, cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // Convert to char array and sort
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    // Main method to test
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are Anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT Anagrams.");
        }
    }
}
