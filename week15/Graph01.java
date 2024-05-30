package week15;

public class Graph01 {
    int vertex;
    int[][] matriks;
    DLL01 list[];

    public Graph01(int vertex) {
        this.vertex = vertex;
        list = new DLL01[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DLL01();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        // add edge
        list[asal].addFirst(tujuan, jarak);

        // add back edge (for undirected)
        list[tujuan].addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception {
        // undirectedGraph
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + list[asal].size());

        int totalIn = 0, totalOut = list[asal].size();

        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    totalIn++;
                }
            }
        }
        System.out.println("Indegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("Outdegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        list[asal].remove(tujuan);
        list[tujuan].remove(asal);
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    try {
                        System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m)");
                        if (j < list[i].size() - 1) {
                            System.out.print(", ");
                        }
                    } catch (Exception e) {
                        System.out.println("Error accessing list data: " + e.getMessage());
                    }
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public void graphMatriks(int v) {
        vertex = v;
        matriks = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matriks[i][j] = -1;
            }
        }
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        try {
            matriks[asal][tujuan] = jarak;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("The vertices does not exists");
        }
    }

    public void printMatriks() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + " : ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }
}
