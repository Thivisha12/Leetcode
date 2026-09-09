class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        Map<Integer,Integer> m=new HashMap<>();
        while(n>i){
            if(m.containsKey(target-nums[i])){
                return new int[]{i,m.get(target-nums[i])};
            }
            else{
                m.put(nums[i],i);
            }
            i++;
        }
       return new int[]{}; 
    }
}