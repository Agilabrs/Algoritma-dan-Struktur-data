package week15;

import java.util.Scanner;

public class GraphMain01 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        /*
         * int v, e, count = 1, to = 0, from = 0;
         * System.out.println("Enter the number of vertices: ");
         * v = scan.nextInt();
         * System.out.println("Enter the number of edges: ");
         * e = scan.nextInt();
         * Graph01 graph = new Graph01(v);
         * while (count <= e) {
         * to = scan.nextInt();
         * from = scan.nextInt();
         * graph.makeEdge(to, from, 1);
         * count++;
         * }
         */
        Graph01 gedung = new Graph01(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();
        for (int i = 0; i < 6; i++) {
            gedung.degree(i);
        }
    }
}
