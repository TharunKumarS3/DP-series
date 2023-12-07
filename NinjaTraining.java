import java.util.*;
public class NinjaTraining {

    static int f(int day,int lastOperation,int[][] points,int[][] dp)
    {
        if (dp[day][lastOperation] != -1) return dp[day][lastOperation];
        if(day==0)
        {
            int maxi=0;
            for(int index=0;index<=2;index++)
            {
                if(index!=-lastOperation)
                {
                    maxi=Math.max(maxi,points[0][index]);

                }

            }
            return dp[day][lastOperation]=maxi;
        }

        int maxi=0;
        for(int i=0;i<=2;i++)
        {
            if(i!=lastOperation)
            {
                int activity=points[day][i]+f(day-1,i, points, dp);
                maxi=Math.max(maxi,activity);
            }
        }
        return dp[day][lastOperation]=maxi;
    }



    static int ninjaTraining(int n,int[][]points)
    {
        int[][]dp=new int[n][4];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        return f(n-1,3,points,dp);



    }


    public static void main(String args[]) {
        // Define the points for each activity on each day
        int[][] points = {{10, 40, 70},
                          {20, 50, 80},
                          {30, 60, 90}};

        int n = points.length; // Get the number of days
        System.out.println(ninjaTraining(n, points)); // Calculate and print the maximum points
    }
    
}
