package week16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class listMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        if (index >= 0 && index < mahasiswas.size()) {
            mahasiswas.remove(index);
        } else {
            System.out.println("Index tidak valid!");
        }
    }

    public void update(int index, Mahasiswa mahasiswa) {
        if (index >= 0 && index < mahasiswas.size()) {
            mahasiswas.set(index, mahasiswa);
        } else {
            System.out.println("Index tidak valid!");
        }
    }

    public void tampil() {
        mahasiswas.forEach(mhs -> System.out.println(mhs));
    }

    private int binarySearch(String nim) {
        Collections.sort(mahasiswas);
        Mahasiswa key = new Mahasiswa(nim, "", "");
        return Collections.binarySearch(mahasiswas, key);
    }

    public void sortAscending() {
        Collections.sort(mahasiswas);
    }

    public void sortDescending() {
        mahasiswas.sort(Comparator.reverseOrder());
    }

    public static void main(String[] args) {
        listMahasiswa lm = new listMahasiswa();

        Mahasiswa m = new Mahasiswa("19001", "Noureen", "08123456789");
        Mahasiswa m1 = new Mahasiswa("19002", "Akhleema", "08123456789");
        Mahasiswa m2 = new Mahasiswa("19003", "Shannum", "08123456789");

        lm.tambah(m, m1, m2);

        lm.tampil();

        int index = lm.binarySearch("19002");
        if (index >= 0) {
            lm.update(index, new Mahasiswa("19002", "Uwais", "08123456789"));
        } else {
            System.out.println("Mahasiswa dengan NIM 19002 tidak ditemukan.");
        }

        System.out.println();
        lm.tampil();

        System.out.println("Sorting Ascending:");
        lm.sortAscending();
        lm.tampil();

        System.out.println("Sorting Descending:");
        lm.sortDescending();
        lm.tampil();
    }
}