public class Merge {
    public static void mergeSort(int[] array, int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(array,l,mid);
            mergeSort(array,mid+1,r);

            merge(array,l,mid, r);
        }
    }
    public static void merge(int[] array, int l, int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i=0;i<n1;i++){
            L[i] = array[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j] = array[mid+1+j];
        }
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(L[i]<=R[j]){
                array[k] = L[i];
                i++;
            }
            else{
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            array[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            array[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = {5,9,1,6,2,7,8,3,10,4};
        System.out.println("Array before sorting");
        for(int j=0;j<array.length;j++){
            System.out.print(array[j] + " ");
        }
        System.out.println();
        mergeSort(array,0,array.length-1);
        System.out.println("Array after sorting");
        for(int j=0;j<array.length;j++){
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }
}
