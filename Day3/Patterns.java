public class Patterns {
    public static void main(String[] args) {
         single(4);
         pattern2(4);
         pattern3(4);
         pattern4(5);
         pattern5(5);
        pattern6(5);
    }
    static void single(int num){
        for(int i=1;i<=num;i++){
            System.out.println(i);
        }
        System.out.println("-----------------------");
    }
    static void pattern2(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("-----------------------");
    }
    static void pattern3(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
    }
    static void pattern4(int num){
        for(int i=1;i<=num;i++){
            for(int k=0;k<(num-i);k++) System.out.print(" ");
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
    }
    static void pattern5(int num){
        for(int i=0;i<num;i++){
            for(int k=0;k<(num-i);k++) System.out.print(" ");
            for(int j=0;j<=i;j++){
                System.out.print(comb(i,j)+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
    }
    static void pattern6(int num){
        for(int i=0;i<num;i++){
            for(int k=0;k<(num-i);k++) System.out.print(" ");
            String s="";
            for(int j=0;j<=i;j++){
                s+=comb(i,j)+"*";
            }
            s=s.substring(0,s.length()-1);
            System.out.println(s);
        }
        System.out.println("-----------------------");
    }

    static int fact(int n){
        if(n<=1) return 1;
        return n*fact(n-1);
    }
    static int comb(int n,int r){
        return fact(n)/(fact(n-r)*fact(r));
    }
}
