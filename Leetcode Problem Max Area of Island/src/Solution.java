class Solution {
	int count=0,max=0;
	int x[]= {-1,0,1,0};
	int y[]= {0,1,0,-1};
	
    public int maxAreaOfIsland(int[][] grid) {
    	
    	int row=grid.length;
    	int col=grid[0].length,i,j;
    	int temp[][]=new int[row][col];
    	
    	for(i=0;i<row;i++)
    	{
    		for(j=0;j<col;j++)
    		{
    			if(check(i,j,row,col,temp))
    			{
    				count=0;
    				fun(grid,temp,i,j,row,col);	
    				if(count>max)
    					max=count;

    			}
    			
    		}
    	}
    	
    	return max;
    }
	private void fun(int[][] grid,int[][]temp, int i, int j, int row, int col) {
		
		if(grid[i][j]==1)
		{
			count++;
			temp[i][j]=1;
			for(int k=0;k<4;k++)
			{
				if(check(i+x[k],j+y[k],row,col,temp))
					fun(grid,temp,i+x[k],j+y[k],row,col);
			}
		}
	}
	private boolean check(int i, int j, int row, int col,int[][]temp) {
		if(i>=0 && j>=0 && i<row && j<col && temp[i][j]==0)
			return true;
		return false;
	}
}