public class BinarySearch {
    //O(log n)
    public static int binarySearch(int[] array, int target){
        int left = 0;
        int right = array.length-1;

        while(left <= right){
            int mid = left + (right -left)/2;
            System.out.println(mid);
            if(array[mid] == target){
                return mid;
            }

            if(array[mid] < target){
                left = mid+1;
            }

            if(array[mid] > target){
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 3;

        int position =  binarySearch(arr, target);
        if(position == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at "+position);
        }
    }
}
