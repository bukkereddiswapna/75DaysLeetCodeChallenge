class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int []r=new int[k];
        while(k-->0){
            int maxfreq=0;
            int maxnum=0;
            for(Map.Entry<Integer,Integer> map:hm.entrySet()){
                if(map.getValue()>maxfreq){
                    maxfreq=map.getValue();
                    maxnum=map.getKey();
                }
            }
            r[k]=maxnum;
            hm.remove(maxnum);
        }
        return r;
    }
}