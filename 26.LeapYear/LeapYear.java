public class LeapYear {
    public static void main(String[] args) {
        // Test with different years
        int[] years = {2000, 2020, 2021, 1900, 2024, 2100};
        
        System.out.println("Leap Year Checker");
        System.out.println("-----------------");
        
        for (int year : years) {
            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
    }
    
    // Method to check if a year is leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if:
        // 1. It is divisible by 4 AND not divisible by 100
        // OR
        // 2. It is divisible by 400
        
        if (year % 400 == 0 || (year%4==0 && year%100!=0 )) {
            return true;  // Divisible by 400 or (div by 4 but not by 100)
        } 
        else{
            return false;
        }
    }
}
