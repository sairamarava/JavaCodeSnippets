import java.util.*;
public class Shift {
    //given an array of strings and return true if you can make all the strings same 
    public static void main(String[] args) {
        String[] input={"abc","bbc","aac"};
        System.out.println(func(input));
    }
    static boolean func(String[] input){
        String res="";
        for(String s:input) res+=s;
        Map<Character,Integer> freq=new HashMap<>();
        for(char ch :res.toCharArray()) {freq.put(ch,freq.getOrDefault(ch, 0)+1);}
        int len=input.length;
        boolean ans=false;
        for(Map.Entry<Character,Integer> e: freq.entrySet()){
            if(e.getValue()%len==0) ans=true;
            else {ans=false; break;}
        }
        return ans;
    }
}
