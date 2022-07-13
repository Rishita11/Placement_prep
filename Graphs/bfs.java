package learn_graphs;
import java.util.*;
public class bfs {
	static private LinkedList<Integer>[] adj;
    private int V;
    private int E;
    
    public bfs(int node) {
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
    public ArrayList<Integer> bfsGraph(int V,ArrayList <ArrayList<Integer>> adj){
    	ArrayList<Integer> bfs=new ArrayList<>();
    	boolean vis[] =new boolean[V+1];
    	for(int i=1;i<=V;i++) {
    		if(vis[i]==false) {
    			Queue<Integer> q= new LinkedList<>();
    			q.add(i);
    			vis[i]=true;
    			while(!q.isEmpty()) {
    				int node=q.poll();
    				bfs.add(node);
    				for(Integer it: adj.get(node)) {
    					if(vis[it]==false) {
    						vis[it]=true;
    						q.add(it);
    					}
    				}
    			}
    		}
    	}
    	return bfs;
    }
	public static void main(String[] args) {
		bfs g=new bfs(4); 
		  g.addEdge(0, 1);
		  g.addEdge(1, 2);
		  g.addEdge(2, 3);
		  g.addEdge(3, 0);
		  ArrayList<Integer> ans= g.bfsGraph(4, adj);
		  System.out.println(g);
		  

	}

}
