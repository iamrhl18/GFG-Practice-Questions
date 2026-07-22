class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int vis[] = new int[adj.size()];
        Queue<Integer> que = new LinkedList<>();
        
        que.offer(0);
        vis[0]=1;
        
        ArrayList<Integer> list =  new ArrayList<>();
        
        while(!que.isEmpty()){
            int node = que.poll();
            list.add(node);
            
            for(int ele : adj.get(node)){
                if(vis[ele]==0){
                    que.offer(ele);
                    vis[ele]=1;
                }
            }
            
        }
        return list;
    }
}