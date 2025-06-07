import java.sql.PreparedStatement;

public class multiplicationTable {
    /**
     * ITERATIVE APPROACH
     * Time Complexity = Space Complexity = O(1)
     */
    public static void iterateTable(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }

    /**
     * RECURSIVE APPROACH
     * Time Complexity = Space Complexity = O(1)
     */
    public static void recursiveTable(int n){
        int i = 1;
        while(i < 11){
            System.out.println(n + " * " + i + " = " + (n*i));
            i = i+1;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        recursiveTable(n);
    }
}
