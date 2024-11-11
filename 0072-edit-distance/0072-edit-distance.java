class Solution {
    
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()+1][word2.length()+1];
        //return help(word1,word2,word1.length(),word2.length(),dp);
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0) dp[i][j]=j;
                else if(j==0) dp[i][j]=i;
                else if(word1.charAt(i-1)==word2.charAt(j-1)) dp[i][j]=dp[i-1][j-1];
                else dp[i][j]=1+Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    /*int help(String w1,String w2,int m,int n,int[][] dp){
        if(m==0&&n==0) return 0;
        //if(m==0||n==0) return  Math.abs(m - n);
        if(m==0) return n;
        if(n==0) return m; 
        if(w1.charAt(m-1)==w2.charAt(n-1)){
            if(dp[m-1][n-1]!=0) return dp[m-1][n-1];
             return help(w1,w2,m-1,n-1,dp);
        }
        if(dp[m][n]==0){
        dp[m][n]=1+Math.min(Math.min(help(w1,w2,m-1,n-1,dp),
                                    help(w1,w2,m,n-1,dp)),
                                    help(w1,w2,m-1,n,dp));
        }
        return dp[m][n];
    }*/
}