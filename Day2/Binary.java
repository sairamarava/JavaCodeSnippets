public class Binary {
    public static void main(String[] args) {
        System.out.println(palindrome("11101"));
    }
    static int palindrome(String s){
        int res=0;
        int l=0,r=s.length()-1;
        while (l<r){ if(s.charAt(r)!=s.charAt(l)) res++; r--;l++;}
        return res;
    }
}
/*
Binary stirng S of length N
number of mismatched pairs that need to be fixed for string to be palindrome
11101
-----
*/ 