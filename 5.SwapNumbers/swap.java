public class swap {
    public static void main(String[] args) {
        int a=20,b=10;
        System.out.println(a+" "+b);
        //add/sub
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // //mult/div
        // a=a*b;
        // b=a/b;
        // a=a/b;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
    }
}
