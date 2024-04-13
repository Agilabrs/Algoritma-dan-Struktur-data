package week8;

public class StackKonversi01 {
    int size;
    int[] tumpukanBiner;
    int top;

    public StackKonversi01() {
        this.size = 32; // asumsi 32 bit
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
            return 0;
        } else {
            top++;
            tumpukanBiner[top] = data;
            return data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
