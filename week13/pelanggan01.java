package week13;

public class pelanggan01 {
    String namaPelanggan;
    String noHp;
    pelanggan01 prev, next;

    pelanggan01(String namaPelanggan, String noHp) {
        this.namaPelanggan = namaPelanggan;
        this.noHp = noHp;
        this.prev = null;
        this.next = null;
    }
}
