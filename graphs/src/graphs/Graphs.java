package graphs;

import java.util.*;

// Adjascency List representation in Java
class Graphs {

    // Add edge
    static void edges(ArrayList<ArrayList<Integer>> am, int s, int d) {
        am.get(s).add(d);
        am.get(d).add(s);

        System.out.print(am.get(s));
        System.out.println(am.get(d));

    }

    // Print the graph
    static void printGraph(ArrayList<ArrayList<Integer>> am) {
        for (int i = 0; i < am.size(); i++) {
            System.out.println("\nVertex " + i + ":");
            System.out.print("head" + "(" + i + ")");

            for (int j = 0; j < am.get(i).size(); j++) {
                System.out.print(" -> " + am.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create the graph
        int V = 5;
        ArrayList<ArrayList<Integer>> digits = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            digits.add(new ArrayList<>());
        }

        // Add edges
        edges(digits, 0, 1);
        edges(digits, 1, 2);
        edges(digits, 2, 3);
        edges(digits, 0, 3);
        edges(digits, 3, 4);

        printGraph(digits);
        
        System.out.println("............................................");
        System.out.println("............................................");

        BFSTraversal bfst = new BFSTraversal(5);

        bfst.addEdge(0, 1);
        bfst.addEdge(1, 2);
        bfst.addEdge(0, 2);
        bfst.addEdge(2, 3);
        bfst.addEdge(1, 4);
        
     //   bfst.BFS(2);
        bfst.BFS(1);
    }

}
