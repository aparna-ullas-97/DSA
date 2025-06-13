package Arrays;

public class Deletion {
    public static void main(String[] args) {
        int delAt = 3;
        int[] array = {1,2,3,4,5,6};
        int[] array1 = new int[array.length -1];

        System.out.println("Array Before Deletion");
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0; i < delAt; i++){
            array1[i] = array[i];
        }
        for(int i = delAt+1; i < array.length; i++){
            array1[i-1] = array[i];
        }
        System.out.println("Array After Deletion");
        for(int i : array1) {
            System.out.print(i + " ");
        }

    }
}
