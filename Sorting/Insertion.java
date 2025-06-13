public class Insertion {
    //Space complexity O(1)
    public static void main(String[] args) {
        int[] array = {4,2,1,3,5};
        for(int i=1; i < array.length; i++){
            int key = array[i];
            int j = i-1;

            while(j>=0 && array[j]>key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        System.out.println("Sorted array");
        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+" ");
        }
    }
}
