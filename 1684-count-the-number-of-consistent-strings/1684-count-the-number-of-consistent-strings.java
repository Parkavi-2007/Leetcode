class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        int count=0;
         
        for(char all:allowed.toCharArray())
        {
            set.add(all);
        }
       
        for(String word:words)
        {
            boolean consis=true;
           for(char c:word.toCharArray())
           {
            if(!set.contains(c))
            {
                consis=false;
                break;
            }
           }
        
        if(consis)
        {
            count++;
        }
        }
        return count;
    }
}