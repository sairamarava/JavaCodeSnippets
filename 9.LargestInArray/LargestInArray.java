public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        System.out.println("Largest: " + max);
    }
}
