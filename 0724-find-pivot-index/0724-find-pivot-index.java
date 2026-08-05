class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int leftsum=0;
        int rightsum=0;
        nums[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            nums[i]=nums[i]+nums[i-1];
        }
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                leftsum=0;
            }
            else
            {
                leftsum=nums[i-1];
            }
            
            rightsum=nums[n-1]-nums[i];
        
        if(leftsum==rightsum)
        {
            return i;
        }
       
        }
        return -1;
    }
}