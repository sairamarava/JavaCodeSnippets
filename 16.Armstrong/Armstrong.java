public class Armstrong {
    public static void main(String[] args) {
        int num=153,sum=0,temp=num;
        int digits=String.valueOf(num).length();
        while(temp>0){
            int d=temp%10;
            sum+=Math.pow(d,digits);
            temp/=10;
        }
        System.out.println(num==sum?"Armstrong":"Not an");
    }
}
