public class findSum {
    public static int findSum(int n) {
        if (n == 0)
            return 0;
        else
            return n + findSum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(findSum(4));
    }
}
