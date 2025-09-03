public class GCD {
    public static int gcd(int a, int b) {
       if(b==0) return a;
       else {
        return gcd(b,a%b);
       }
    }

    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}
