public class Race {
    public static void main(String[] args) {
    int numCars=4;
    int[] speeds={2,4,3,1};
    int idx=1;
    double time=0.1;
    System.out.println(func(numCars,speeds,idx,time));
    }
    static int func(int numCars,int[] speeds, int idx, double time){
        double sec=time*10*6;
        double ans=sec*speeds[idx];
        double answ=0;
        double dist=0;
        for(double i=0;i<sec;i++){
            answ=answ+speeds[idx];
            dist+=answ;
        }
        return (int)dist;
    }
}
/* 
 * N prototype cars unique accelration, N cars at pos 0 speed=0
 * every sec, ith car -->A[i]
 * car move by its curr speed
 * find and retrun int exact distance covered by xth car after s mins
 * Time s is given in decimals 1.5
 * input: N integer
 * input: Arrays A of acceleration  of N cars
 * input: index of car u need to find out
 * input: S time wth one decimal place
 * 
 * ex: 4 [2,4,3,1] 3 0.1
*/
