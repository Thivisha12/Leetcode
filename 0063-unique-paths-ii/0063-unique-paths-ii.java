class Solution {
    public int helper(int[][] arr, int i, int j, int[][]dp){
        int m=arr.length;
        int n=arr[0].length;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(arr[i][j]==1){
            return 0;
        }
        if(i==m-1 && j== n-1){
            return 1;
        }
        if(i==m-1){
            return dp[i][j]= helper(arr, i, j+1,dp);
        }
        if(j==n-1){
            return dp[i][j]= helper(arr, i+1,j,dp);
        }
        return dp[i][j]=helper(arr,i,j+1,dp)+ helper(arr, i+1, j,dp);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[]a : dp){
            Arrays.fill(a,-1);
        }
        return helper(obstacleGrid, 0,0,dp);
    }
}