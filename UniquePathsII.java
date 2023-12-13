import java.util.Arrays;

public class UniquePathsII {


     public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] row:dp)
        Arrays.fill(row,-1);

        return maze(m-1,n-1,grid,dp);
        
    }
    int maze(int i,int j,int[][] grid,int[][] dp)
    {
           if(i<0 || j<0 )
        return 0;

        if(i>=0 && j>=0 && grid[i][j]==1)
        return 0;

     
        if (i == 0 && j == 0)
        return 1;

        if(dp[i][j]!=-1)
        return dp[i][j];

        int up=maze(i-1,j,grid,dp);
        int left=maze(i,j-1,grid,dp);

        return dp[i][j]=up+left;


    }
    
}
