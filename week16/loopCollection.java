package week16;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class loopCollection {

    public static void main(String args[]) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.add("Snake Fruit");

        // Iterasi menggunakan for-each loop
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n" + fruits.toString());

        // Iterasi menggunakan while loop dengan pop (menggunakan remove)
        while (!fruits.isEmpty()) {
            System.out.printf("%s ", fruits.remove(fruits.size() - 1));
        }
        System.out.println();

        // Menambahkan elemen kembali ke List
        fruits.add("Melon");
        fruits.add("Durian");

        // Ganti elemen terakhir menjadi "Strawberry"
        fruits.set(fruits.size() - 1, "Strawberry");

        // Menambahkan elemen baru
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");

        // Lakukan sorting
        Collections.sort(fruits);

        // Iterasi menggunakan for-each loop setelah sorting
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println();

        // Iterasi menggunakan Iterator
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println();

        // Iterasi menggunakan stream
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println();

        // Iterasi menggunakan for loop dengan indeks
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
    }
}
