package week7;

public class MergeSortMain01 {
    public static void main(String[] args) {
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("sorting dengan marge sort");
        MergeSort mSort = new MergeSort();
        System.out.println("Data Awal");
        mSort.printArray(data);
        mSort.margeSort(data);
        System.out.println("Setelah diurutkan");
        mSort.printArray(data);
    }
}
