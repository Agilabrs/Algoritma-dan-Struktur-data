package week13;

import week12.tugas.Film;

public class bengkel01 {
    pelanggan01 head, tail;
    int size;
    layanan01 front, rear;
    int tot;

    public bengkel01() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean kosong() {
        return tot == 0;
    }

    public void enqueue(String namaPelanggan, String noHp) {
        pelanggan01 pList = new pelanggan01(namaPelanggan, noHp);
        if (isEmpty()) {
            head = tail = pList;
        } else {
            tail.next = pList;
            pList.prev = tail;
            tail = pList;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            pelanggan01 remove = head;
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            size--;
            System.out.println(remove.namaPelanggan + " telah selesai dihapus");
        }
    }

    public int size() {
        return size;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            pelanggan01 current = head;
            System.out.println("Daftar Antrian");
            System.out.println("====================");
            while (current != null) {
                System.out.println("- " + current.namaPelanggan + "| " + current.noHp + "| ");
                current = current.next;
            }
        }
    }

    public void addLayanan(int kodeLayanan, int harga, String namaLayanan) {
        layanan01 newNode = new layanan01(kodeLayanan, harga, namaLayanan);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
    }

    public void printLayan() {
        layanan01 now = front;
        while (now != null) {
            System.out.println("Kode: " + now.kodeLayanan + ", Nama: " + now.namaLayanan + ", Harga: " + now.harga);
            now = now.next;
        }
    }

    public int hitungHarga() {
        int harTot = 0;
        layanan01 now = front;
        while (now != null) {
            harTot += now.harga;
            now = now.next;
        }
        return harTot;
    }

    public void sort() {
        if (front == null) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            layanan01 now = front;
            while (now.next != null) {
                if (now.harga > now.next.harga) {
                    String tempnamaLayanan = now.namaLayanan;
                    int tempharga = now.harga;
                    now.namaLayanan = now.next.namaLayanan;
                    now.harga = now.next.harga;
                    now.next.namaLayanan = tempnamaLayanan;
                    now.next.harga = tempharga;
                    swapped = true;
                }
                now = now.next;
            }
        } while (swapped);
        System.out.println();
    }
}
