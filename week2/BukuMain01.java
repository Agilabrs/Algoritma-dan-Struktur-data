
public class BukuMain01 {
    String judul, pengarang;
    int halaman, stok, harga;

    public BukuMain01(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    public static void main(String[] args) {
        BukuMain01 bk1 = new BukuMain01("Today Ends Tomorrow Comes", "Denanda Pratiwi", 198, 13, 71000);
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        BukuMain01 bk2 = new BukuMain01("Self Reward", "Maheera Ayesa", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
    }

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : " + harga);
    }

    void terjual(int jml) {
        stok -= jml;
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

}
