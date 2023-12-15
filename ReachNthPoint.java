import java.util.*;
public class ReachNthPoint {
    
    public int nthPoint(int n)
    {
        // Code here
       int[] dp=new int[n+1];
      Arrays.fill(dp,-1);
      int ans=check(n,dp);
      return ans;
    }
    static int check(int n,int[] dp)
    {
      
          if(n==0)
        return 1;
        
        if(n<0)
        return 0;
        if(dp[n]!=-1)
        return dp[n];
        
        int left=check(n-1,dp);
        int right=check(n-2,dp);
        
        return dp[n]=(left+right)%1000000007;
    }
}
