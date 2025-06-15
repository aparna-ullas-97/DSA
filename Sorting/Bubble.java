public class Bubble {
    public static void main(String[] args) {
        int[] array = {5,6,1,3};
        boolean swaped = false;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }

        }
        System.out.println("Array after sorting");
        for(int i:array){
            System.out.print(i + " ");
        }

    }
}
