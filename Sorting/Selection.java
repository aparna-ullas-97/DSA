public class Selection {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        int[] array2 = {-1, 64, 0, 64, -1};
        System.out.println("Array before sorting: ");

        for (int i = 0; i < array.length; i++) {
            for (int k : array)
                System.out.print(k + " ");
            System.out.println();
            if (i != array.length - 1) {
                int min = array[i];
                int index = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < min) {
                        min = array[j];
                        index = j;
                    }
                }

                int temp = array[i];
                array[i] = min;
                array[index] = temp;

            }
        }
        System.out.println("Array after sorting: ");
        for (int i : array)
            System.out.print(i + " ");
    }
}
