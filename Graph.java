import java.io.*;
import java.util.*;

class Graph {
    private int V;                             
    private LinkedList<Integer> adj[];       
    private Queue<Integer> queue;    
    
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++)
        {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }
}

