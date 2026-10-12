class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxi=0;
        int length=0;
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet())
        {
            if(map.containsKey(num+1))
            {
                 length = map.get(num) + map.get(num + 1);
                    }
    maxi=Math.max(maxi,length);
        }
        return maxi;
    }
}