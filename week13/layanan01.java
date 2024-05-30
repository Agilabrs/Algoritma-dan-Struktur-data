package week13;

public class layanan01 {
    int kodeLayanan, harga;
    String namaLayanan;
    layanan01 prev, next;

    layanan01(int kodeLayanan, int harga, String namaLayanan) {
        this.kodeLayanan = kodeLayanan;
        this.harga = harga;
        this.namaLayanan = namaLayanan;
        this.prev = null;
        this.next = null;
    }
}
