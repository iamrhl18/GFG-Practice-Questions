class Solution {
    
    public void traverse(int i ,int j , char[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        if(i<0 || i>=row || j<0 || j>=col || grid[i][j]=='W' || grid[i][j] == 'V') return;
        grid[i][j]='W';
        
        // WE have 8 choice of moving 
        //up
        traverse(i-1,j,grid);
        //up right 
        traverse(i-1,j+1,grid);
        // left 
        traverse(i,j+1,grid);
        // left down
        traverse(i+1,j+1,grid);
        // down 
        traverse(i+1,j,grid);
        // down left
        traverse(i+1,j-1,grid);
        // left
        traverse(i,j-1,grid);
        //up left
        traverse(i-1,j-1,grid);
        
    }
    public int countIslands(char[][] grid) {
         
        // Creating the 2D vis ara
        

        
        int count =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                
                if(grid[i][j] == 'L'){
                    count++;
                    traverse(i,j,grid);
                }
                
            }
        }
        return count;
    }
}