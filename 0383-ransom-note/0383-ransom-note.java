class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[]=new int[26];
        for(int i=0;i<magazine.length();i++)
        {
            char c=magazine.charAt(i);
            freq[c-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            char c1=ransomNote.charAt(i);
            freq[c1-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]<0)
            {
                return false;
            }
        }
        return true;
    }
}