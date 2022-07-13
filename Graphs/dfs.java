class Solution {
    // Function to return a list containing the DFS traversal of the graph.
     public void find(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> storedfs) {
    	storedfs.add(node);
    	vis[node]=true;
    	for(Integer it:adj.get(node)) {
    		if(vis[it]==false) {
    			find(it,vis,adj,storedfs);
    		}
    	}
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       ArrayList<Integer> storedfs=new ArrayList<>();
    	boolean vis[]=new boolean[V+1];
    	for(int i=0;i<V;i++) {
    		if(vis[i]==false) {
    			find(i,vis,adj,storedfs);
    		}
    	}
    	return storedfs;
    }
}
