class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> hp=new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
        for(int num:map.keySet())
        {
            hp.add(num);
            if(hp.size()>k)
                hp.poll();
        }
        int r[]=new int[k];
        for(int i=k-1;i>=0;i--)
        {
            r[i]=hp.poll();
        }
        return r;
    }
}