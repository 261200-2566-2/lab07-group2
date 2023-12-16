import java.util.Collection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMapSet map=new HashMapSet();
        HashMapSet map2=new HashMapSet();


        map.add(1);
        map.add("banana");
        map.add(true);
        map2.add(2);
        System.out.println(map.contains("banana"));
        System.out.println(map.contains(1));

        System.out.println(map.contains(2));

    }
}