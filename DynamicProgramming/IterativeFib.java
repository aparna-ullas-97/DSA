public class IterativeFib {
    public static int fib(int n) {
        if (n <= 1) return n;
        else{
            int[] calc =  new int[n+1];
            calc[0] = 0;
            calc[1] = 1;
            for(int i=2; i<=n; i++){
                calc[i] = calc[i-1] + calc[i-2];
            }
            return calc[n];
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n));
    }
}
