class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=1;i<s.length();i++)
        {
            char a=s.charAt(i);
            char b=s.charAt(i-1);
            int diff=Math.abs(b-a);
            sum+=diff;
            
        }
        return sum;
    }
}