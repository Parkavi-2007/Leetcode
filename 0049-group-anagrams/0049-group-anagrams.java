class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String words:strs)
        {
            int freq []=new int[26];
            for(char c:words.toCharArray())
            {
                freq[c-'a']++;
            }
            String key=Arrays.toString(freq);
            
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());  
            }
            map.get(key).add(words);
        }
        return new ArrayList<>(map.values());
    }
}