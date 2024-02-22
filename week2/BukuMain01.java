
public class BukuMain01 {
    String judul, pengarang;
    int halaman, stok, harga, bayar, terjual;
    double diskon;

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
        System.out.println("Diskon : " + diskon);
        System.out.println("Bayar : " + bayar);
    }

    int terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        }
        return terjual;
    }

    void restock(int jml) {
        stok += jml;
    }

    int gantiHarga(int hrg) {
        harga = hrg;
        return harga;
    }

    int hitungHargaTotal(int harga) {
        int total;
        total = terjual * harga;
        return total;
    }

    double hitungDiskon(int total) {
        if (total > 150000) {
            diskon = total * 0.12;
        } else if (total > 75000 && total < 150000) {
            diskon = total * 0.05;
        } else {
            diskon = 0;
        }
        return diskon;
    }

    int hitungHargaBayar(int diskon, int total) {
        int bayar;
        bayar = total - diskon;
        return bayar;
    }

}
