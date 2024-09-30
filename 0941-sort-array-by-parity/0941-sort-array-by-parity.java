class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=nums.length;
        int k=0;
        int arr[]=new int[l];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                arr[k]=nums[i];
                k++;
            }
        }
         for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                arr[k]=nums[i];
                k++;
            }
        }
        return arr;
    }
}