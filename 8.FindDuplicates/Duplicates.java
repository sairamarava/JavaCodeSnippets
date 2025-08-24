import java.util.*;
public class Duplicates {
    public static void main(String[] args) {
        Map<Character, Integer> freq= new HashMap<>();
        String input="sai ram reddy";
        for(char ch: input.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character, Integer> e : freq.entrySet()){
            if(e.getValue()>1 && e.getKey()!=' '){
                System.out.print(e.getKey()+"->"+e.getValue()+" ");
            }
        }
    }
}
