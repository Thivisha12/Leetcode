class Solution {
    public int findDuplicate(int[] nums) {
        int a=nums.length ;
        int s=0;
        int f=0;
       
        do{
            s=nums[s];
            f=nums[nums[f]];
        } while(s!=f);
        f=0;
        while(s!=f)
        {
           s=nums[s];
           f=nums[f];
            
        }
        return f;
        
    }
}