
class odd_or_even_int {
    public static boolean bitwiseShift(int n){
        return n == (n >> 1) << 1;
    }
    public static boolean bitwiseAND(int n){
        return (n & 1) == 0;
    }
    public static boolean findRemainder(int n){
        return n % 2 == 0;
    }
    public static void main(String[] args){
        int n = 0;
        if(bitwiseShift(n))
            System.out.println("EVEN");
        else
            System.out.println("ODD");
    }
}