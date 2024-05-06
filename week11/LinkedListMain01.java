package week11;

public class LinkedListMain01 {
    public static void main(String[] args) {
        LinkedList01 singLL = new LinkedList01();

        singLL.print();
        singLL.addFirst(new Mahasiswa01(111, "Anton"));
        singLL.print();
        singLL.addLast(new Mahasiswa01(112, "Prita"));
        singLL.print();
        singLL.insertAfter(112, new Mahasiswa01(113, "Yusuf"));
        singLL.print();
        singLL.insertAfter(113, new Mahasiswa01(114, "Doni"));
        singLL.print();
        singLL.insertAt(4, new Mahasiswa01(115, "Sari"));
        singLL.print();

    }
}