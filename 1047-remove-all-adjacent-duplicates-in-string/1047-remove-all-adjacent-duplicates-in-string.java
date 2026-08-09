class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(sb.length()==0)
            {
    
            sb.append(c);
          
            }
            else if(c==sb.charAt(sb.length()-1))
            {
                sb.deleteCharAt(sb.length()-1);
            }
            else
            {
                sb.append(c);
            }
        }
        String s1=sb.toString();
        return s1;

    }
}