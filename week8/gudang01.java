
package week8;

public class gudang01 {
    barang01[] tumpukan;
    int size;
    int top;

    public gudang01(int kapasitas) {
        size = kapasitas;
        tumpukan = new barang01[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public barang01 tambahBarang(barang01 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan di gudang");
            return brg;
        } else {
            System.out.println("Gagal tumpukan barang di gudang sudah penuh");
            return null;
        }
    }

    public barang01 ambilBarang() {
        if (!cekKosong()) {
            barang01 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " berhasil diambil dari gudang");
            return delete;
        } else {
            System.out.println("Gagal tumpukan barang di gudang kosong");
            return null;
        }
    }

    public barang01 lihatBarangTeratas() {
        if (!cekKosong()) {
            barang01 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian barang di gudang :");
            // for (int i = top; i >= 0; i--) {
            for (int j = 0; j <= top; j++) {
                System.out.printf("Kode %d: %s(kategori %s)\n ", tumpukan[j].kode, tumpukan[j].nama,
                        tumpukan[j].kategori);
            }
            // }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
}
