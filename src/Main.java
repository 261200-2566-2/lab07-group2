import java.util.Collection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMapSet map=new HashMapSet();

        System.out.println("Add 1 banana and true");
        map.add(1);
        map.add("banana");
        map.add(true);
        System.out.println("Contains banana : " + map.contains("banana"));
        map.remove(1);
        System.out.println("(Remove 1) Contains 1 : " + map.contains(1));
        System.out.println("Size : " + map.size());
        System.out.println("Contains 2 : " + map.contains(2));
        map.clear();
        System.out.println("(Clear) Is this map empty : " + map.isEmpty());

    }
}