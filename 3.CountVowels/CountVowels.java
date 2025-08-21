public class CountVowels {
    public static void main(String[] args) {
        String str = "interview";
        int count = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) count++;
        }
        System.out.println("Vowels: " + count);
    }
}
