public class Fibo {
    public static void main(String[] args) {
        int a=0,b=1,c;
        int n=5;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
