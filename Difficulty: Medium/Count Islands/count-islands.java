class Solution {
    
    public void traverse(int i ,int j , char[][] grid , int[][] vis){
        int row = grid.length;
        int col = grid[0].length;
        if(i<0 || i>=row || j<0 || j>=col || vis[i][j]==1 || grid[i][j]=='W') return;
        vis[i][j]=1;
        
        // WE have 8 choice of moving 
        //up
        traverse(i-1,j,grid,vis);
        //up right 
        traverse(i-1,j+1,grid,vis);
        // left 
        traverse(i,j+1,grid,vis);
        // left down
        traverse(i+1,j+1,grid,vis);
        // down 
        traverse(i+1,j,grid,vis);
        // down left
        traverse(i+1,j-1,grid,vis);
        // left
        traverse(i,j-1,grid,vis);
        //up left
        traverse(i-1,j-1,grid,vis);
        
    }
    public int countIslands(char[][] grid) {
         
        // Creating the 2D vis ara
        
        int[][] vis = new int[grid.length][grid[0].length];
        
        int count =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                
                if(vis[i][j]==0 && grid[i][j] == 'L'){
                    count++;
                    traverse(i,j,grid,vis);
                }
                
            }
        }
        return count;
    }
}