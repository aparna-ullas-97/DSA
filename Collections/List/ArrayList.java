package List;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> li = new java.util.ArrayList<>();
        li.add("Java");
        li.add("Python");
        li.add("C++");
        li.add("C");
        System.out.println("Elements of the list are: ");
        for (String s : li) {
            System.out.println(s);
        }

        System.out.println("Element 1 of the list is: " + li.get(1));

        li.set(1, "DSA");
        System.out.println("Updated 1st element of the list with: " + li.get(1));

        li.remove(1);
        System.out.println("New List: " + li);


        // create a list of integers
        java.util.ArrayList<Integer> al = new java.util.ArrayList<>();

        // add some integers to the list
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(2);

        // use indexOf() to find the first occurrence of an
        // element in the list
        int i = al.indexOf(7);

        System.out.println("First Occurrence of 7 is at Index: "+i);

        // use lastIndexOf() to find the last occurrence of
        // an element in the list
        int l = al.lastIndexOf(7);

        System.out.println("Last Occurrence of 7 is at Index: "+l);

        al.remove(Integer.valueOf(2));
        al.remove(Integer.valueOf(2));
        System.out.println(al);

        System.out.println(al.contains(3));
    }


}
