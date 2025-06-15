import java.util.Random;

public class QuickSort {
    private static final Random rand = new Random();
    public static void quickSort(int[] array, int low, int high){
        if(low < high){
            int pivot = partitionRandom(array, low,high);
            quickSort(array,low,pivot-1);
            quickSort(array,pivot+1,high);
        }
    }
    private static int partitionRandom(int arr[], int low, int high) {
        int pivotIndex = rand.nextInt(high - low + 1) + low;
        int pivotValue = arr[pivotIndex];

        swap(arr, pivotIndex, high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivotValue) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
    public static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(array[j]<=pivot){
                i++;
                swap(array,i,j);
            }
        }
        swap(array,i+1,high);
        return i+1;
    }
    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {5,9,1,6,2,7,8,3,10,4};
        System.out.println("Array before sorting");
        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+" ");
        }
        System.out.println();
        quickSort(array, 0, array.length-1);
        System.out.println("Array after sorting");
        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+" ");
        }
        System.out.println();
    }
}
