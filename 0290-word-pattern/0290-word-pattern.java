class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> ps=new HashMap<>();
        HashMap<String,Character> sp=new HashMap<>();
        String [] s1=s.split(" ");
        if (pattern.length() != s1.length) {
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            char p=pattern.charAt(i);
            
            if(ps.containsKey(p) &&! ps.get(p).equals(s1[i]))
            {
                return false;
            }
            if(sp.containsKey(s1[i]) && !sp.get(s1[i]).equals(p))
            {
                return false;
            }

            ps.put(p,s1[i]);
            sp.put(s1[i],p);
        }
    return true;
    }
}