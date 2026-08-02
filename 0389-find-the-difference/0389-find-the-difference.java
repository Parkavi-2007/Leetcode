class Solution {
    public char findTheDifference(String s, String t) {
       int s_sum=0;
       int t_sum=0;
       for(int i=0;i<s.length();i++)
       {
        char c=s.charAt(i);
        s_sum+=(int)c;
       }
       for(int i=0;i<t.length();i++)
       {
        char k=t.charAt(i);
        t_sum+=(int)k;
       }
       int tar=t_sum-s_sum;
       return (char)tar;

    }
}