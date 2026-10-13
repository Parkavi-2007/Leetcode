class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set=new HashSet<>();
        char res=' ';
        for(char c:s.toCharArray())
        {
            if(!set.contains(c))
            {
                set.add(c);
            }
            else if(set.contains(c)){
                res=c;
                break;
            }
        }
        return res;
    }
}