package week12.tugas;

public class DoubleLinkedListQueue {
    node head, tail;
    int size;

    public DoubleLinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int nom, String name) {
        node newnode = new node(nom, name);
        if (isEmpty()) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Atrian kosong");
        } else {
            node removedNode = head;
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            size--;
            System.out.println(removedNode.name + " telah selesai divaksinasi");
        }

    }

    public int size() {
        return size;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            node current = head;
            System.out.println("+++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++");
            while (current != null) {
                System.out.println("| " + current.nom + "\t|" + current.name + "\t|");
                current = current.next;
            }
            System.out.println("Sisa Antrian: " + size);
        }
    }
}
