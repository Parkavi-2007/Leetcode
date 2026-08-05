class Solution {
    public String reverseWords(String s) {
        String [] str=s.trim().split("\\s+");
        int st=0;
        int en=str.length-1;
      while(st<en)
      {
        String temp=str[st];
        str[st]=str[en];
        str[en]=temp;
        st++;
        en--;
      }
      return String.join(" ",str);
    }
}