class Pair{
    int val;
    int par;
    Pair(int v , int p){
        val = v;
        par=p;
    }
}



class Solution {
    
    public boolean dfs(int V , ArrayList<ArrayList<Integer>> adj , int[] vis,int st){
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(st,-1));
        vis[st]=1;
        
        while(!q.isEmpty()){
            Pair p = q.poll();
            int value = p.val;
            int parent = p.par;
            for(int ele : adj.get(value)){
                if(ele != parent){
                    if(vis[ele]==1) return true;
                    else{
                        vis[ele] =1;
                        q.offer(new Pair(ele,value));
                    }
                }
            }
        }
        
        return false;
    }
    
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] arr : edges){
            adj.get(arr[0]).add(arr[1]);
            adj.get(arr[1]).add(arr[0]);
        }
        
        int vis[] = new int[V];
        
        
        
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(dfs(V,adj,vis,i))
                return true;
            }
        }
        
        return false;
    }
}





