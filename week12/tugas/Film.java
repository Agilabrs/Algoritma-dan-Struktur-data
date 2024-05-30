package week12.tugas;

public class Film {
    int id;
    String judul;
    double rating;
    Film prev, next;

    public Film(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }

    public String toString() {
        return "ID : " + id + " Judul : " + judul + " Rating : " + rating;
    }

}
