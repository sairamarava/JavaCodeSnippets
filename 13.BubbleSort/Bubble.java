public class Bubble {
    static void BubbleS(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    public static void main(String args[]){
        int[] arr = {3,2,1};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        BubbleS(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
