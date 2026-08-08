class Solution {
    public int vowelConsonantScore(String s) {
        int vowels=0;
        int conson=0;
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if("aeiou".indexOf(c)!=-1)
            {
                vowels++;
            }
            else if(Character.isLetter(c))
            {
                conson++;
            }
            
        }
        if(conson>0)
        {
        res=vowels/conson;
        }
        return res;
        
    }
}