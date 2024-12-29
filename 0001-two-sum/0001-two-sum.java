class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // for (int i = 0; i < n - 1; i++) {
        //    for (int j = i + 1; j < n; j++) {
        //          if (nums[i] + nums[j] == target) {
        //              return new int[]{i, j};
        //          }
        //      }
        //  }
        //  return new int[]{}; // No solution found
        int i=0;
        
       
         Map<Integer,Integer> m=new HashMap<>();
        while(i<n){
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