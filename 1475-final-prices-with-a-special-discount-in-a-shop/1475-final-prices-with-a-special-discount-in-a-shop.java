class Solution {
    public int[] finalPrices(int[] n) {
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(n[j]<=n[i])
                {
                    n[i]=n[i]-n[j];
                    break;
                }
                else{
                    n[i]=n[i];
                }
            }
        }
        return n;
    }
}