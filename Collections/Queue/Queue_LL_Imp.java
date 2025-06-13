package Queue;
import java.util.*;
public class Queue_LL_Imp {
    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Dallas");
        pq.add("Beetroot");
        pq.add("Carrot");

        Iterator iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
