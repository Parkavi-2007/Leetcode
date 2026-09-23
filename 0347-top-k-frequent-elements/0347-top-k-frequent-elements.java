class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
    
        int []n=new int[k];
        int res1=0;
        int res2=0;
       
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            else{
                map.put(nums[i],1);
            }
            
        }
         for(int j=0;j<k;j++)
        {
        int max=Integer.MIN_VALUE;
        int maxkey=0;
        for(int key:map.keySet() )
       {
        int freq=map.get(key);
        if(freq>max)
        {
            max=freq;
            maxkey=key;
        }
       
       }
       n[j]=maxkey;
       map.remove(maxkey);
        }
    
        return n;
    }
    }
