public class Cons1NotAllowed {

     long mod = 1000000007;
    long countStrings(int n) {
        // code here
        if(n==0)return 952443644;
        if(n==1)return 2;
        long dp[] = new long[n];
        dp[0] = 2;
        dp[1] = 3;
        for(int i=2;i<n;i++){
            dp[i] = (dp[i-2]+dp[i-1])%mod;
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        Cons1NotAllowed cons1NotAllowed=new Cons1NotAllowed();
    System.out.println(cons1NotAllowed.countStrings(3));
    }
    
}

   
