class Solution {
    
    void dfs(int node ,  ArrayList<ArrayList<Integer>> adj  , int[] vis){
        vis[node]=1;
        for(int ele:adj.get(node)){
            if(vis[ele] ==0){
                dfs(ele,adj,vis);
            }
        }
    }
    int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
        
        // Creating adj list form the edges
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }
        
        for(ArrayList<Integer> list : edges){
            adj.get(list.get(0)).add(list.get(1));
            adj.get(list.get(1)).add(list.get(0));
        }
        
        int vis[] = new int[V];
        int count =0;
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                count++;
                dfs(i,adj,vis);
            }
        }
        return count;
    }
}