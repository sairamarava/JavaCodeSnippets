public class Sum {
    static boolean palindorme(int num){
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        return num==rev;
    }
    public static void main(String[] args) {
        int num=121,res=0;
        while(num>0){
            res+=num%10;
            num/=10;
        }
        System.out.println(res);
        System.out.println(palindorme(num)?"palindrome":"not  a palindrome");
    }
}
