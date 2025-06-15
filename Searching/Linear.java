public class Linear {
    public static int linearSearch(int[] array, int target){
        for(int i = 0; i < array.length; i++){
            if(array[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {5,9,1,6,2,7,8,3,10};
        int target = 7;
        int position =  linearSearch(array,target);
        if(position != -1){
            System.out.println(target + " found at position " + position);
        }
        else{
            System.out.println(target + " not found");
        }
    }
}
