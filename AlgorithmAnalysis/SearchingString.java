public class SearchingString {
    public static int returnPos(String[] array, String target){
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] array = {"a","b","c","d","e","f","g"};
        String target = "C";

        int pos = returnPos(array, target);
        if(pos != -1){
            System.out.println(target + " found at position " + pos);
        }
        else {
            System.out.println(target + " not found");
        }
    }
}
