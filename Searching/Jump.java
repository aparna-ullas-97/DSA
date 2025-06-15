public class Jump {
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1; // Target not found
            }
        }

        // Linear search phase
        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target) {
                return i; // Target found, return index
            }
        }
        return -1; // Target not found after linear search
    }
    public static void main(String[] args) {
        int[] array = {5,9,1,6,2,7,8,3,10};
        int target = 7;
        int position = jumpSearch(array, target);
        if(position != -1){
            System.out.println(target + " found at position: " + position);
        }
        else {
            System.out.println("Target not found");
        }
    }
}
