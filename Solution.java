import java.util.Arrays;

class Solution{
    
    
    static int findMax( int row, int col, int m,int M[][],int dp[][]){
        
        if(row<0 || col>=m || row>= M.length){
            return 0;
        }
        
        
        // f(i) = max( f(i,j+1), max ( f(i-1,j+1) , f(i+1,j+1)));
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        
        
        dp[row][col] = M[row][col]  + Math.max( findMax(row,col+1 , m , M, dp) ,
        Math.max(  findMax(row-1,col+1, m , M, dp) , findMax(row+1,col+1, m , M, dp)));

        int a=dp[row][col];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        return dp[row][col];
        
    }
    
    static int maxGold(int n, int m, int M[][])
    {
        // code here
        
        int dp[][] = new int[n][m];
        
        
        for(int a [] : dp){
            Arrays.fill(a,-1);
        }
        
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = Math.max(ans,findMax(i,0,m,M,dp));
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int[][]M = {{1, 3, 1, 5},
     {2, 2, 4, 1},
     {5, 0, 2, 3},
     {0, 6, 1, 2}};
        
        System.out.println(s.maxGold(4, 4, M));
    }
}

