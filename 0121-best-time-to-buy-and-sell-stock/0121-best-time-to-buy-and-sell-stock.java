class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxprof=0;
        for(int p:prices)
        {
            if(p<min)
            {
                min=p;
            }
            else{
                int prof=p-min;
                maxprof=Math.max(prof,maxprof);
            }
        }
        return maxprof;
    }
}