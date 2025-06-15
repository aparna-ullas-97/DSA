public class Binary {
    public static int binarySearch(int[] array, int high, int low, int target){
        int mid = (low+high)/2;
        if(array[mid] == target){
            return mid;
        }
        else if(array[mid] < target){
            return binarySearch(array,low,mid-1,target);
        }
        else if(array[mid] > target){
            return binarySearch(array,mid+1,high,target);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {5,9,1,6,2,7,8,3,10};
        int target = 7;
        int position = binarySearch(array, 0, array.length-1, target);
        if(position != -1){
            System.out.println(target + " found at position: " + position);
        }
        else {
            System.out.println("Target not found");
        }
    }
}
