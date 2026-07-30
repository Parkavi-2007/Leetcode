class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder();
        char c;
        for(int i=0;i<s.length();i++)
        {
             c=s.charAt(i);
           c= Character.toLowerCase(c);
             sb.append(c);
        }
      
        return sb.toString();
    }
}