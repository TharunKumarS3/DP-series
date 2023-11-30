import java.util.Arrays;

public class FrogJump2 {
    
    public  static int solve(int ind,int[] height,int[] dp,int k)
    {
        if(ind==0)
        return 0;

        if(dp[ind]!=-1)
        return dp[ind];

        int minSteps = Integer.MAX_VALUE;

        for(int j=1;j<=k;j++)
        {
            if(ind-j>=0)
            {
            int jump=solve(ind-j,height,dp,k)+Math.abs(height[ind]-height[ind-j]);
            minSteps=Math.min(minSteps,jump);
            }
        }
        return dp[ind]=minSteps;
    }





 public static void main(String args[]) {


  int height[]={30,10,60 , 10 , 60 , 50};
  int n=height.length;
  int dp[]=new int[n];
  Arrays.fill(dp,-1);
  System.out.println(solve(n-1,height,dp,4));
}
}
