package week7;

public class PencarianBuku {
    private Buku01[] listBk = new Buku01[5];
    private int idx;

    public void tambah(Buku01 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    public void tampil() {
        for (Buku01 m : listBk) {
            if (m != null) {
                m.taampilDataBuku();
            }
        }
    }

    public int findSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < idx; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data " + x + " ditemukan di indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos) {
        if (pos != -1) {
            System.out.print("Kode buku \t:" + x);
            System.out.print("Judul buku \t:" + listBk[pos].judulBuku);
            System.out.print("Tahun terbit \t:" + listBk[pos].tahunTerbit);
            System.out.print("Pengarang \t:" + listBk[pos].pengarang);
            System.out.print("Stock \t:" + listBk[pos].stock);
        } else {
            System.out.println("data " + x + " tidak ditemukan ");
        }
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return mid;
            } else if (listBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, right);
            } else {
                return FindBinarySearch(cari, left, right);
            }
        }
        return -1;
    }
}
