class Solution {
    public int singleNumber(int[] nums) {
        int s=0;
        for(int num:nums){
            s^=num;
        }
        return s;
    }
}