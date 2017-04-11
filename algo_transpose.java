import java.util.*;

class algo_transpose
{
    private int V;
    private LinkedList<Integer> adj[];
    public static ArrayList arr=new ArrayList();
    algo_transpose(int V)
    {
        this.V=V;
        adj = new LinkedList[V];
         for (int i=0; i<V; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int u, int v)
    {
        adj[u].add(v);
        adj[v].add(u);
    }
 
    void transpose()
    {
        algo_transpose gr = new algo_transpose(V);
        for(int v=0;v<V;v++)
        {
            Iterator<Integer> i=adj[v].listIterator();
            while(i.hasNext())
            {
                gr.adj[i.next()].add(v);
            }
        }
        for(int i=0;i<=V;i++)
        { 
            System.out.println(i+"->"+gr.adj[i]);
        }
    }   
 
    public static void main(String args[])
    {
        algo_transpose g = new algo_transpose(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.transpose();
        
    }
}    