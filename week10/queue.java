package week10;

public class queue {
    Pembeli01[] data;
    int front;
    int rear;
    int size;
    int max;

    public queue(int n) {
        max = n;
        data = new Pembeli01[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].nama + " " + data[front].noHp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekrear() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[rear].nama + " " + data[rear].noHp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public int peekPosition(String nama) {
        if (!isEmpty()) {
            int position = 1;
            int i = front;
            while (true) {
                if (data[i].equals(nama)) {
                    return position;
                }
                position++;
                i = (i + 1) % size;
                if (i == (rear + 1) % size) {
                    break;
                }
                System.out.println(nama + " Terletak pada posisi " + position);
            }
        }
        return -1;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].nama + " " + data[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(data[i].nama + " " + data[i].noHp);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void enqueue(Pembeli01 dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public Pembeli01 dequeue() {
        Pembeli01 dt = new Pembeli01();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            // Menghentikan Program
            System.exit(1);
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }

            }
        }
        return dt;
    }
}
