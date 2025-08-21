public class Prime {
    static void genPrime(int low, int high){
        for(int i=low;i<=high;i++){
            boolean isprime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if (i%j==0){
                    isprime=false;
                    break;
                }
            }
            if (isprime){ System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int num=13;
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isprime=false;
            }
        }
        System.out.println(isprime?"prime":"not a prime");
        genPrime(2,11 );
    }   
}
