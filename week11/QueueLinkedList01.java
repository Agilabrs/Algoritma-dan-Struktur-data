package week11;

public class QueueLinkedList01 {
    Node01 front, rear;

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(Mahasiswa01 data) {
        Node01 Node = new Node01(data, null);
        if (isEmpty()) {
            front = Node;
            rear = Node;
        } else {
            rear.next = Node;
            rear = Node;
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
    }

    void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        Node01 temp = front;
        System.out.println("Antrian Layanan Unit Kemahasiswaan:");
        while (temp != null) {
            System.out.println("NIM: " + temp.data.NIM + ", Nama: " + temp.data.nama);
            temp = temp.next;
        }
    }
}
