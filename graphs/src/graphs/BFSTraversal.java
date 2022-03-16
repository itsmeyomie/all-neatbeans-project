/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class BFSTraversal {

    int V;

    private  LinkedList<Integer> adj[];

    public BFSTraversal(int v) {

        this.V = v;

        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {

            adj[i] = new LinkedList();

        }
    }

    public  void addEdge(int u, int v) {

        adj[u].add(v);
    }

    void BFS(int s) {

    boolean visited[] = new boolean[V];

    LinkedList<Integer> queue = new LinkedList();

    visited[s] = true;
    queue.add(s);

    while (!queue.isEmpty()) {
      s = queue.poll();
      System.out.print(s + " ");

      Iterator<Integer> i = adj[s].listIterator();
      while (i.hasNext()) {
        int n = i.next();
        if (!visited[n]) {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }

         

    public void DFSVisit(int s, HashMap<Integer, Integer> parent) {

        System.out.println("parent = " + parent.toString());

        System.out.println("s= " + s);

        for (int v : adj[s]) {

            if (!parent.containsKey(v)) {

                parent.put(v, s);

                DFSVisit(v, parent);

            }

        }

    }

    public void DFS(int v) {

        HashMap<Integer, Integer> parent = new HashMap<>();

        parent.put(v, null);

        DFSVisit(v, parent);

    }
}
