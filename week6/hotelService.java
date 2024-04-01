package week6;

public class hotelService {
    hotel rooms[] = new hotel[3];
    int idx;

    void tambah(hotel h) {
        if (idx < rooms.length) {
            rooms[idx] = h;
            idx++;
        } else {
            System.out.println("Hotel sudah tutup!!");
        }
    }

    void tampilAll() {
        for (hotel h : rooms) {
            h.tampil();
            System.out.println("--------------------------");
        }
    }

    void bubSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].harga > rooms[j - 1].harga) {
                    hotel temp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = temp;
                }
            }
        }
    }

    void selSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[idxMin].harga) {
                    idxMin = j;
                }
            }
            hotel temp = rooms[i];
            rooms[i] = rooms[idxMin];
            rooms[idxMin] = temp;
        }
    }
}
