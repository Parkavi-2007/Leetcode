class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
    
        for(int num:nums1)
        {
            set.add(num);
        }
        for(int num1:nums2)
        {
            if(set.contains(num1))
            {
              result.add(num1);
            }
        }
        int i=0;
int n[]=new int [result.size()];
for(int res:result)
{
    n[i]=res;
    i++;
}
        return n;
    }
}