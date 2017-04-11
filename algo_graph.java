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
}
public class algo_graph{
	public static  void  main(String[] args)
	{
        graph g=new graph(6);
        g.add_edge(0,2);
        g.add_edge(0,3);
        g.add_edge(0,1);
        g.add_edge(1,4);
        g.add_edge(4,5);
        for(int i=0;i<=5;i++)
        { 
        	System.out.println(i+"->"+g.adj[i]);
        }
	}
	
}