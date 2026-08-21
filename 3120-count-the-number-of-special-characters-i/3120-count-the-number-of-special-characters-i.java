class Solution {
    public int numberOfSpecialChars(String word) {
        boolean lower []=new boolean [26];
        boolean upper []=new boolean [26];
       int count=0;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(Character.isLowerCase(c))
            {
                lower[c-'a']=true;
            }
            if(Character.isUpperCase(c))
            {
                upper[c-'A']=true;
            }
        }
        for(int i=0;i<26;i++)
        {
             if(lower[i]==true&&upper[i]==true)
             {
                count++;
             }
        }
        return count;

    }
}