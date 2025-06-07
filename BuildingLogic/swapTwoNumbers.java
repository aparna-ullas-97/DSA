public class swapTwoNumbers {
    /**
     * USING A TEMPORARY VARIABLE
     * Time Complexity = Space Complexity = O(1)
     */
    public static void tempVar(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " b = " + b);
    }

    /**
     * USING ARITHMETIC OPERATORS
     * Time Complexity = Space Complexity = O(1)
     */
    public static void arithmeticOp(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);
    }

    /**
     * USING XOR
     * Time Complexity = Space Complexity = O(1)
     */
    public static void xor(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        xor(1, 2);
    }
}
