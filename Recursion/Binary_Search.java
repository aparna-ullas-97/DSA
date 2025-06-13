public class Binary_Search {
    public static int binary_search(int[] array, int target, int l, int r){
        if(r < l)
            return -1;
        int mid = l + (r - l)/2;
        if(array[mid] == target)
            return mid;
        else if(array[mid] < target)
            return binary_search(array, target, mid+1, r);
        else
            return binary_search(array, target, l, mid-1);

    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int target = 1;
        int pos = binary_search(array, target, 0, array.length-1);
        if(pos == -1){
            System.out.println("No");
        }
        else{
            System.out.println(pos);
        }
    }
}
