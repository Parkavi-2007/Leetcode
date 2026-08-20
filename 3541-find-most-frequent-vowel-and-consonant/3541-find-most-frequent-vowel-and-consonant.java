class Solution {
    public int maxFreqSum(String s) {
        int vow []=new int [26];
        int con []=new int [26];
        int maxv=0;
        int maxc=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if("AEIOUaeiou".indexOf(c)!=-1)
            {
                vow[c-'a']++;
            }
            else
            {
                con[c-'a']++;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(vow[i]>maxv)
            {
                maxv=vow[i];
            }
            if(con[i]>maxc)
            {
                maxc=con[i];
            }
        }
        return maxv+maxc;
    }
}