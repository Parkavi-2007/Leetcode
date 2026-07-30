class Solution {
    public int lengthOfLastWord(String s) {
        String [] str=s.split(" ");
        String word=str[0];
         for(int i=0;i<str.length;i++)
         {
            if(i<str.length)
            {
             word=str[i];
            }
         }
         return word.length();
    }
}