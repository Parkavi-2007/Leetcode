class Solution {
    public int[] twoSum(int[] n, int tar) {
        int num[]=new int[2];
       int l=0;
       int r=n.length-1;
       while(l<r)
       {
        if(n[l]+n[r]==tar)
        {
            num[0]=l+1;
            num[1]=r+1;
            break;
        }
        else if(n[l]+n[r]>tar)
        {
            r--;
        }
        else
        {
            l++;
        }
       }
       return num;
    }
}