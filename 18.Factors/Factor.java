public class Factor{
    static void Fact(int num){
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.print(i+" ");
            if(i!=num/i) System.out.print(num/i+" ");
            }
        }
    }
    public static void main(String[] args){
        int n=9;
        for(int i=1;i<=n;i++){
            if(n%i==0) System.out.print(i+" ");
        }
        System.out.println();
        Fact(n);
    }
}