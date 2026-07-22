class Solution {
    
    public void dfsTraversal(int node , int[] vis , ArrayList<Integer> list , ArrayList<ArrayList<Integer>> adj){
        
        // 
        vis[node]=1;
        list.add(node);
        
        for(int ele:adj.get(node)){
            if(vis[ele]==0){
                dfsTraversal(ele,vis,list,adj);
            }
        }
        
        
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int node = 0;
        int[] vis = new int[adj.size()];
        
        dfsTraversal(node,vis,list,adj);
        return list;
    }
}