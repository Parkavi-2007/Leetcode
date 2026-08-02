class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!='*')
            {
                sb=sb.append(c);
            }
            else
            {
                sb=sb.deleteCharAt(sb.length()-1);
            }
        }
        String s1=sb.toString();
        return s1;
    }
}