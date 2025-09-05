public class Rotate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int len=arr.length;
        int num=4;
        for(int i=0;i<num;i++){
            int first=arr[0];
            for(int j=1;j<len;j++) arr[j-1]=arr[j];
            arr[len-1]=first;
            for(int a:arr) System.out.print(a+" ");
            System.out.println();
        }
    }
}
