package week11;

public class LinkedList01 {
    Node01 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node01 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                System.out.println("NIM: " + tmp.data.NIM + " Nama: " + tmp.data.nama);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(Mahasiswa01 data) {
        Node01 ndInput = new Node01(data, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Mahasiswa01 data) {
        Node01 ndInput = new Node01(data, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int NIMKey, Mahasiswa01 data) {
        Node01 ndInput = new Node01(data, null);
        Node01 temp = head;
        boolean keyFound = false;

        while (temp != null) {
            if (temp.data.NIM == NIMKey) {
                keyFound = true;
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }

        if (!keyFound) {
            System.out.println("NIM tidak ditemukan");
        }
    }

    void insertAt(int index, Mahasiswa01 data) {
        Node01 ndInput = new Node01(data, null);
        if (index < 0) {
            System.out.println("Index Tidak Valid");
            return;
        } else if (index == 0) {
            addFirst(data);
            return;
        }

        Node01 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = new Node01(data, temp.next);
        if (temp.next.next == null) {
            tail = temp.next;
        }
    }
}