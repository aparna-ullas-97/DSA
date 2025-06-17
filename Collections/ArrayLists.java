import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        List<String> pets = new ArrayList<>(Arrays.asList("Dog", "Cat", "Rabbit", "Penguin", "Snakes", "Fish", "Parrot"));

        //Getting an element from index
        System.out.println(pets.get(0));

        //Adding a new element
        pets.add("Hamster");
        System.out.println(pets);

        //Adding a new element at an index
        pets.add(0, "Rooster");
        System.out.println(pets);

        //Deleting an element
        pets.remove("Hamster");
        System.out.println(pets);
        pets.remove(0);
        System.out.println(pets);
        pets.remove("Hamster");
        System.out.println(pets);

        //Sorting
        Collections.sort(pets);
        System.out.println(pets);

        //Reverse Sorting
        Collections.reverse(pets);
        System.out.println(pets);

        //Sublists
        System.out.println(pets.subList(0,3));

        //Sublists
        pets.removeIf(p -> p.startsWith("P"));
        System.out.println(pets);
    }
}
