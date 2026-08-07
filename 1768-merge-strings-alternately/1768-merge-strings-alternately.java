class Solution {
    public String mergeAlternately(String s1, String s2) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        char c1=' ';
        char c2=' ';
        while(i<s1.length()&&j<s2.length())
        {
             c1=s1.charAt(i);
             c2=s2.charAt(j);
           sb=sb.append(c1);
            sb=sb.append(c2);
            i++;
            j++;
        }
        while(i<s1.length())
        {
            sb=sb.append(s1.charAt(i));
            i++;
        }
        while(j<s2.length())
        {
            sb=sb.append(s2.charAt(j));
            j++;
        }
        
        return sb.toString();
    }
}