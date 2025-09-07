public class StringInterleaved {
    // Function to check if C is an interleaving of A and B
    public static boolean isInterleaved(String A, String B, String C) {
        int m = A.length();
        int n = B.length();
        if (C.length() != m + n) return false;
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i > 0 && A.charAt(i - 1) == C.charAt(i + j - 1)) {
                    dp[i][j] |= dp[i - 1][j];
                }
                if (j > 0 && B.charAt(j - 1) == C.charAt(i + j - 1)) {
                    dp[i][j] |= dp[i][j - 1];
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String A = "abc";
        String B = "def";
        String C1 = "adbcef"; // true
        String C2 = "abdecf"; // true
        String C3 = "abcdef"; // true
        String C4 = "abdfec"; // false

        System.out.println("Is '" + C1 + "' interleaved? " + isInterleaved(A, B, C1));
        System.out.println("Is '" + C2 + "' interleaved? " + isInterleaved(A, B, C2));
        System.out.println("Is '" + C3 + "' interleaved? " + isInterleaved(A, B, C3));
        System.out.println("Is '" + C4 + "' interleaved? " + isInterleaved(A, B, C4));
    }
}
