class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int t=(n*(n+1))/2;
        for(int num:nums){
            t=t-num;
        }
        return t;
    }
}