class Solution {
    public int projectionArea(int[][] grid) {
        int N=grid.length, ans=0;
		
		for(int i=0;i<N;i++){
			int row=0,col=0;
			for(int j=0;j<N;j++){
				if(grid[i][j]>0)ans++;
				row=Math.max(grid[i][j],row);//i行最大
				col=Math.max(grid[j][i],col);//j列最大
			}
			ans+=row+col;
		}
		return ans;
    }
}