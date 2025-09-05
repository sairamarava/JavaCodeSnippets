import java.util.*;
public class Match {
    public static void main(String[] args) {
        String input="abc10";
        int maxDist=0;
        int left=0,right=input.length()-1;
        while(left<=right){
            if (input.charAt(left)==input.charAt(right)){
                left++;
                right--;
            }
            else{
                maxDist=Math.max(maxDist,right-left);
                left++;
                right--;
            }
        }
        System.out.println(maxDist);
    }
}
