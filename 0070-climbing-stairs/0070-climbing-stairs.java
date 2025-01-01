class Solution {
    public int climbStairs(int n) {
      int dp[]=new int[n+1];
    Arrays.fill(dp,-1);
    return solution(n,dp);
}
public int solution(int n,int dp[])
{
    
     if(n==0||n==1) return 1;
        if(dp[n]!=-1)
        {
            return dp[n];
         }
         else
         {
            dp[n] = solution(n - 1, dp) + solution(n - 2, dp);
            return dp[n];
         }
}
}