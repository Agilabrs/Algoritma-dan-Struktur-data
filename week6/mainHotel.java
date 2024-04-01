package week6;

public class mainHotel {
    public static void main(String[] args) {
        hotelService list = new hotelService();
        hotel h1 = new hotel("Red Doorz", "Kediri", 100000, (byte) 3);
        hotel h2 = new hotel("OYO", "Jombang", 90000, (byte) 2);
        hotel h3 = new hotel("Permata", "Malang", 120000, (byte) 5);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);

        System.out.println("data hotel sebelum sorting :");
        list.tampilAll();

        System.out.println("data hotel setelah bubble sorting berdasarkan harga :");
        list.bubSort();
        list.tampilAll();

        System.out.println("data hotel setelah selection sorting berdasarkan harga :");
        list.selSort();
        list.tampilAll();
    }
}
