import java.util.*;
public class Cocolate {
    public static void main(String[] args) {
        int num=6;
        int res=0;
        for(int i=1;i<=num;i++){
            if(i%5==0){
                res+=i+4;
            }
            else res+=i;
        }
        System.out.println(res);
    }
}
