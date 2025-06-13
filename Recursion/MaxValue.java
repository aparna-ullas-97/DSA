public class MaxValue {
    public static int maxValue(int[] array, int l, int r) {
        if ((r-l) <= 1) {
            if(array[l]<array[r]) {
                return array[l];
            }
            else {
                return array[r];
            }
        }
        else{
            int mid = (l+r)/2;
            int left = maxValue(array, l, mid);
            int right = maxValue(array, mid+1, r);
            return left > right ? left : right;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int target = 1;
        int maxValue = maxValue(array, 0, array.length-1);
        System.out.println(maxValue);
    }
}
