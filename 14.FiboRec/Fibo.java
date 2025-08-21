public class Fibo {
    static int FiboR(int n){
        if(n<=1) return n;
        return FiboR(n-1)+FiboR(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            System.out.println(FiboR(i)+" ");
        }
    }
}
