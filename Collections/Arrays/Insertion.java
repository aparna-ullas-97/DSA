package Arrays;

public class Insertion {
    public static void main(String[] args) {
        int insertAt = 3;
        int insertVal = 8;
        int[] array1 = {1,2,3,4,5};

        System.out.println("Original Array");
        for (int j : array1) {
            System.out.println(j);
        }

        int[] array2 = new int[array1.length + 1];
        for(int i = 0; i < insertAt; i++) {
            array2[i] = array1[i];
        }

        array2[insertAt] = insertVal;

        for(int i = insertAt+1; i < array2.length; i++) {
            array2[i] = array1[i-1];
        }

        System.out.println("New Array");
        for (int j : array2) {
            System.out.println(j);
        }
    }
}
