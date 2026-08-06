class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char [] c=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r)
        {
            
            while(l<r&&!Character.isLetterOrDigit(c[l]))
            {
                l++;
            }
             while(l<r&&!Character.isLetterOrDigit(c[r]))
            {
                r--;
            }
            if(c[l]!=c[r])
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}