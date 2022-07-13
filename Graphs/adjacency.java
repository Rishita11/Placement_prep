package learn_graphs;
import java.util.*;
public class adj_list {
	
    private LinkedList<Integer>[] adj;
    private int V;
    private int E;
    
    public adj_list(int node) {
    	this.V=node;
    	this.E=0;
    	this.adj = new LinkedList[node];
    	for(int i=0;i<V;i++) {
    		adj[i]=new LinkedList<>();
    	}
    }
    
    public void addEdge(int u,int v) {
    	adj[u].add(v);
    	adj[v].add(u);
    	E++;
    }
     
    public String toString(){
    	StringBuilder sb=new StringBuilder();
    	sb.append(V+" vertices "+ E+" edges"+"\n");
    	for(int i=0;i<V;i++) {
    		sb.append(i+":");
    		for(int j:adj[i]) {
    			sb.append(j+" ");
    		}
    		sb.append("\n");
    	}
    	return sb.toString();
    }
    
	public static void main(String[] args) {
	  adj_list g= new adj_list(4);
	 
	  g.addEdge(0, 1);
	  g.addEdge(1, 2);
	  g.addEdge(2, 3);
	  g.addEdge(3, 0);
	  
	  System.out.println(g);
	  
    
	}

}
