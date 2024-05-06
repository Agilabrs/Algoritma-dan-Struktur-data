package week11;

public class QueueLinkedListMain {
    public static void main(String[] args) {
        QueueLinkedList01 queue = new QueueLinkedList01();

        // Enqueue beberapa mahasiswa
        queue.enqueue(new Mahasiswa01(111, "Anton"));
        queue.enqueue(new Mahasiswa01(112, "Prita"));
        queue.enqueue(new Mahasiswa01(113, "Yusuf"));
        queue.enqueue(new Mahasiswa01(114, "Doni"));
        queue.enqueue(new Mahasiswa01(115, "Sari"));

        // Tampilkan antrian
        queue.displayQueue();

        // Dequeue 2 kali
        queue.dequeue();
        queue.dequeue();

        // Tampilkan antrian setelah dequeue
        queue.displayQueue();
    }
}
