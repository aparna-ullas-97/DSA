package Arrays;

public class Merging {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5}; //5
        int[] arr2 = {6,7,8,9,10,11};//6

        int[] merged = new int[arr1.length+arr2.length];

        for(int i = 0; i < arr1.length; i++)
            merged[i] = arr1[i];


        int start = arr1.length;
        for(int i = 0; i<arr2.length; i++){
            merged[start] = arr2[i];
            start++;
        }
        for(int i : merged)
            System.out.print(i + " ");
    }
}
