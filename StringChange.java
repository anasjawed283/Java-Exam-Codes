public class StringChange {
    public static int minDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Create a table to store the minimum edit distances
        int[][] dp = new int[m + 1][n + 1];

        // Initialize the table
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        // Fill the table using dynamic programming
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j]));
                }
            }
        }

        // Return the minimum edit distance
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "sitting";
        String s2 = "kitten";
        int minDistance = minDistance(s1, s2);
        System.out.println("Minimum number of operations required: " + minDistance);
    }
}
