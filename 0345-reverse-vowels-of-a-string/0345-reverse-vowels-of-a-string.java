class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        char c[]=s.toCharArray();
       // String a=new String();
        while(l<r)
        {
            if("AEIOUaeiou".indexOf(c[l])!=-1&&"AEIOUaeiou".indexOf(c[r])!=-1)
            {
                char temp=c[l];
                c[l]=c[r];
                c[r]=temp;
                l++;
                r--;
            }
            else if("AEIOUaeiou".indexOf(c[l])==-1)
            {
                l++;
               
            }
            else
            {
                r--;
            }
        }
        
        return new String(c);
    }
}