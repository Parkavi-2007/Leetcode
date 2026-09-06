class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character,Integer> st=new HashMap<>();
        HashMap<Character,Integer> ts=new HashMap<>();

        for(char c:s.toCharArray())
        {
           st.put(c,st.getOrDefault(c,0)+1);
        }
        for(char c1:t.toCharArray())
        {
           ts.put(c1,ts.getOrDefault(c1,0)+1);
        }
    return st.equals(ts);
    }
}