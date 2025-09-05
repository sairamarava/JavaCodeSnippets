import java.util.*;
public class Kaprekar {
    public static void main(String[] args) {
        for(int i=4;i<=100;i++) func(i);
    }
    static void func(int num){
        int exp=2;
        double square=Math.pow(num,exp);
        String sq=String.valueOf(square);
        int len=sq.length();
        String res="";
        int first,sec;
        for(int i=0;i<(len/2)-1;i++){
            res+=sq.charAt(i);
        }
        first=Integer.parseInt(res);
        res="";
        for(int i=(len/2)-1;i<len-2;i++){
            res+=sq.charAt(i);
        }
        sec=Integer.parseInt(res);
        if(first+sec==num) System.out.println(num);
    }
}
