import java.util.*;
public class Books{
    public static void main(String[] args){
        int[] books={4,3,2,1};
        int maxHours=5;
        int res=func(books,maxHours);
        System.out.println(res);
        System.out.println(func1(books,maxHours));
    }
    static int func(int[] books, int maxHours){
        Arrays.sort(books);
        int readTime=0,numBooks=0;
        for(int i=books.length-1;i>=0;i--){
            int time=books[i];
            //System.out.println(time);
            if (readTime<maxHours) {numBooks+=1; readTime+=time; }
        }
        return numBooks;
    }
    static int func1(int[] arr, int k){
        int max=0,sum=0;
        for(int num:arr){
            if(sum==k) return max;
            else if(sum+num<=k){
                sum+=num;
                max+=1;
            }
            else continue;
        }
        return max;
    }
}