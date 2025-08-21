import java.util.*;
public class Largest {
    public static void main(String[] args) {
    int[] arr={2,3,7,3,2,1};
    int max=arr[0];
    int second=arr[0];
    for(int num: arr){
        if (num>max){
            second=max;
            max=num;
        }
        else if(num>second && num!=max){
            second=num;
        }
    }
    System.out.println(max+" "+second);   
    Arrays.sort(arr);
    for(int ele: arr) System.out.print(ele+" ");
    System.out.println("\n"+ arr[arr.length-1]+" "+arr[arr.length-2]);
    }
}
