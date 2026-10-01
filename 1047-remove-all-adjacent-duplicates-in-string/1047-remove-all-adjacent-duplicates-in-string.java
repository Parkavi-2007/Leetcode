class Solution {
    public String removeDuplicates(String s) {
       Stack<Character> st=new Stack<>();
       for( char c:s.toCharArray())
       {
         
            if( !st.isEmpty()&&st.peek()==c)
            {
              
                    st.pop();
                
            }
            else{
                st.push(c);
            }
            
       } 
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<st.size();i++)
       {
        sb.append(st.get(i));
       }
       return sb.toString();
    }
}