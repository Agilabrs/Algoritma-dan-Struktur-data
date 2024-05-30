package week12.tugas;

public class node {
    int nom;
    String name;
    node prev, next;

    node(int nom, String name) {
        this.nom = nom;
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}
