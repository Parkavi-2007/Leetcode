class Solution {
    public boolean checkIfPangram(String s) {
        boolean seen[]=new boolean[26];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            seen[c-'a']=true;
        }
        for(int i=0;i<26;i++)
        {
        if(seen[i]==false)
        {
            return false;
        }
        }
        return true;
}
}