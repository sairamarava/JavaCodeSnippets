class Reverse{
    public static void main(String[] args) {
        String str="mada";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(str.equals(rev)?"palindrome":"not");
        String reverse=new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reverse)?"palindrome":"not");
    }
}