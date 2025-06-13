public class averageCase {
    public static int[] linearSearch(int[] array, int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            if (array[i] == target) {
                int[] result = {i, count};
                return result;
            }
        }
        int[] result = {-1, count};
        return result;
    }

    public static void main(String[] args) {
        int iterations = 0;
        int[] array = {6, 2, 0, 5, 1, 7, 8, -1, 4};

        for (int i = 0; i < 9; i++) {
            int target = array[i];

            int[] result = linearSearch(array, target);

            if (result[0] == -1) {
                System.out.println("Element not found in the array");
                System.out.println(result[1] + " calculations were needed");
            } else {
                System.out.println("Element found at index: " + result[0]);
                System.out.println(result[1] + " calculations were needed");
            }
            iterations += result[1];
        }
        System.out.println("The average search took " + iterations/9 + " iterations");
    }
}
