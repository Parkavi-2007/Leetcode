class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> t1=new Stack<>();
        char [] c1=s.toCharArray();
        char [] c2=t.toCharArray();
        for(int i=0;i<s.length();i++)
        {
             
            if(c1[i]=='#')
            {
                if(!s1.isEmpty()){
                s1.pop();
                
            }
             }
            else{
                s1.push(c1[i]);
            }
        }
         for(int i=0;i<t.length();i++)
        {
           
            if(c2[i]=='#')
            {
                 if(!t1.isEmpty()){
                t1.pop();
            }
            }
            else{
                t1.push(c2[i]);
            }
            
        }
        String res1=s1.toString();
        String res2=t1.toString();
    if(!res1.equals(res2))
    {
        return false;
    }

      return true;

    }
}