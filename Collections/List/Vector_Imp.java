package List;
import java.util.*;

public class Vector_Imp {
    public static void main(String[] args) {
        int sizeOfVector = 5;
        List<Integer> vec = new java.util.Vector<Integer>();

        for (int i = 0; i < sizeOfVector; i++){
            vec.add(i);
        }

        System.out.println(vec);

        vec.remove(3);
        System.out.println("Removing element at 3rd position" + vec);

        for (int i = 0; i < vec.size(); i++){
            System.out.print(vec.get(i) + " ");
        }
    }
}
