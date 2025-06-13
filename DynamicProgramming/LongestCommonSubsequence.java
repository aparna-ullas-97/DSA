public class LongestCommonSubsequence {

    public static int longestCommonSubsequence(String A, String B) {
        // Get the length of each input string.
        int m = A.length();
        int n = B.length();

        // Initialize a 2D array to store the LCS lengths.
        // dp[i][j] will contain the length of LCS of prefixes A[0..i-1] and B[0..j-1].
        int[][] dp = new int[m + 1][n + 1];

        // Loop through each cell in the 2D array.
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                // Base case: If either of the strings is empty, LCS length is 0.
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                // If the corresponding characters in A and B are equal,
                // then we can extend the LCS for A[0..i-2] and B[0..j-2] by 1.
                else if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                // If the corresponding characters in A and B are different,
                // take the maximum LCS length between A[0..i-1] & B[0..j-2] or A[0..i-2] & B[0..j-1].
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // The value at dp[m][n] contains the length of LCS for A and B.
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "abch";
        String s2 = "abkbhdfglxc";
        System.out.println(longestCommonSubsequence(s1, s2));
    }
}
