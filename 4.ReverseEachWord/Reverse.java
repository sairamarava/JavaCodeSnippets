public class Reverse {
    static void reverse(String str){
        String[] words=str.split(" ");
        StringBuilder res=new StringBuilder();
        for(String word: words){
            res.append(new StringBuilder(word).reverse().toString());
            res.append(" ");
        }
        System.out.println(res.toString());
    }
    public static void main(String[] args) {
        String input="sairam is a good boy";
        String[] words=input.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word: words){
            result.append(new StringBuilder(word).reverse().toString());
            result.append(" ");
        }
        System.out.println(result.toString());
        reverse(input);
    }
}
