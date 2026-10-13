class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int mid=n/2;
        HashSet<Character> set=new HashSet<>();
        int count1=0;
        int count2=0;
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        for(int i=0;i<mid;i++)
        {
            char [] c1=s.toCharArray();
            if(set.contains(c1[i]))
            {
                count1++;
            }
        }
         for(int i=mid;i<n;i++)
        {
            char [] c2=s.toCharArray();
            if(set.contains(c2[i]))
            {
                count2++;
            }
        }
        if(count1!=count2)
        {
            return false;
        }
    return true;
    }
}