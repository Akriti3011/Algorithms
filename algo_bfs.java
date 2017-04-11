import java.util.*;

class graph{
    static int n;
    static LinkedList<Integer> adj[];
    public graph(int n)
    {
    	this.n=n;
    	adj=new LinkedList[n];
    	for(int i=0;i<n;i++)
    	{
    		adj[i]=new LinkedList();
    	}

    }

    public static void add_edge(int u,int v){
    	adj[u].addFirst(v);
    }

     public static void BFS(int s)
    {
        boolean visited[] = new boolean[n];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        while (queue.size() != 0)
        {
            s = queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int m = i.next();
                if (!visited[m])
                {
                    visited[m] = true;
                    queue.add(m);
                }
            }
        }
    }
public class bfs{
	public static  void  main(String[] args)
	{
        graph g=new graph(6);
        g.add_edge(0,2);
        g.add_edge(0,3);
        g.add_edge(0,1);
        g.add_edge(1,4);
        g.add_edge(4,5);
        System.out.println("Following is Breadth First Traversal "+"(starting from vertex 2)");
        g.BFS(2);
	}
	
}