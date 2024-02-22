public class buku01 {
    String judul, pengarang;
    int halaman, stok, harga;

    public buku01() {

    }

    public buku01(String jd, String pg, int hal, int stok, int har) {
        judul = jd;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    public static void main(String[] args) {
        buku01 agil = new buku01("Sang Pemimpi", "Abdillah Agil Arbiansyah", 210, 7, 78000);
        agil.tampilInformasi();
        agil.terjual(5);
        agil.gantiHarga(60000);
    }

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        } else {
            stok = 0;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
}
