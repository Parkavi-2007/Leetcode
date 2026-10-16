class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashSet<String> set=new HashSet<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:arr)
        {
            set.add(s);
        }
        for(String s1:arr)
        {
            map.put(s1,map.getOrDefault(s1,0)+1);
        
        }
        for (String s : arr) {
            if (map.get(s) == 1) {
                k--;

                if (k == 0) {
                    return s;
                }
            }
        }
        return "";
    }
}