public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println("Pascal's Triangle with n = 5:");
        printPascalTriangle(5);
        System.out.println("\nPascal's Triangle with n = 7:");
        printPascalTriangle(7);
    }

    // Print Pascal's Triangle up to n rows
    static void printPascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            // Print spaces for alignment
            for (int space = 0; space < (n - i - 1); space++) {
                System.out.print("  ");
            }
            
            // Print numbers for current row
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", combination(i, j));
            }
            System.out.println();
        }
    }

    // Calculate combination C(n,r) = n!/(r!(n-r)!)
    static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // Calculate factorial of n
    static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}