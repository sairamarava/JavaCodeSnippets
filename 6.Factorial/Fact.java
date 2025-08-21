public class Fact {
    static int factn(int n){
        return (n==0 || n==1 ? 1 : n*factn(n-1));
    }
    public static void main(String[] args) {
        int num=5;
        int res=1;
        for(int i=1;i<=num;i++){
            res*=i;
        }
        System.out.println("Factorial: "+res);
        System.out.println("Factorial: "+factn(num));
    }
}
