class Solution {
    public int [] sortColors(int[] nums) {
     int zero=0;
     int one=0;
     int two=0;
     for(int n:nums)
     {
        if(n==0)
        {
            zero++;
        }
        else if(n==1)
        {
            one++;
        }
        else
        {
            two++;
        }
     }
     int i=0;
     while(zero>0)
     {
        nums[i]=0;
        i++;
        zero--;
     }
     while(one>0)
     {
        nums[i]=1;
        i++;
        one--;
     }
     while(two>0)
     {
        nums[i]=2;
        i++;
        two--;
     }
     return nums;
    }
}