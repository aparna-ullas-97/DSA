package List;

import java.util.List;
import java.util.Stack;

public class Stack_Imp {
    public static void main(String[] args) {
        int sizeOfStack = 5;
        List<Integer> vec = new Stack<>();

        for (int i = 0; i < sizeOfStack; i++){
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
