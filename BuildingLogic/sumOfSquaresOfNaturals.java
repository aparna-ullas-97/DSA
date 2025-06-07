public class sumOfSquaresOfNaturals {
    /**
     * ITERATIVE APPROACH
     * Time Complexity = O(n)
     * Space Complexity = O(1)
     */
    public static int iterateSum(int n){
        int sum = 0;
        for(int i = 0; i <=n; i++){
            int k = i*i;
            sum += k;
        }
        return sum;
    }

    /**
     * FORMULA APPROACH
     * (n * (n + 1) * (2k + 1)) / 6
     * Time Complexity = O(1)
     * Space Complexity = O(1)
     */
    public static int formulaSum(int n){
        return n*(n+1)*(2*n + 1)/6;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(formulaSum(n));
    }
}
