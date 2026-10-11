class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character>set=new HashSet<>();
        int count=0;
        // char arr []=jewels.toCharArray();
        //char arr1[]=stones.toCharArray();
        for(char c:jewels.toCharArray())
        {
            set.add(c);
        }
        for(char c1:stones.toCharArray())
        {
            if(set.contains(c1))
            {
                count++;
            }
        }
        return count;
    }
}