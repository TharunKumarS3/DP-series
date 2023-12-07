import java.util.Arrays;

public class HouseRobber {

   
    
    public int money(int i, int nums[], int[]dp){
        if(i>=nums.length) return 0;

        if(i == nums.length-1) return nums[nums.length-1];
        if(dp[i] != -1) return dp[i];
        return dp[i] = Math.max( (nums[i] + money(i+2, nums, dp)), (money(i+1, nums, dp)) );

    }
    
    public int rob(int[] nums) {
        int dp1[] = new int[nums.length+1];
        int dp2[] = new int[nums.length+1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        if(nums.length==1) return nums[0];
        int [] nums1 = new int[nums.length-1];
        int [] nums2 = new int[nums.length-1];
        for(int i=1; i<nums.length; i++){
             nums1[i-1] = nums[i];
        }
        for(int i=0; i<nums.length-1; i++){
             nums2[i] = nums[i];
        }
        return Math.max( money(0,nums1,dp1), money(0, nums2, dp2));
    }
    
}



    
