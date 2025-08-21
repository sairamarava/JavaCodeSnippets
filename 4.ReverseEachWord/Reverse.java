public class Reverse {
    public static void main(String[] args) {
        String input="sairam is a good boy";
        String[] words=input.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word: words){
            result.append(new StringBuilder(word).reverse().toString());
            result.append(" ");
        }
        System.out.println(result.toString());
    }
}
