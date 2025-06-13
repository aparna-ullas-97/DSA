public class LinearSearch {
    //O(n)
    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int target = 6;

        int position = linearSearch(array, target);
        if(position == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position " + position);
    }
}
