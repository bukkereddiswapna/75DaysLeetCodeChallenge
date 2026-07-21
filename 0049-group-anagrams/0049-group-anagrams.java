class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hm=new HashMap<>();
        for(String str: strs){
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String s= new String(ch);
            if(!hm.containsKey(s)){
                hm.put(s,new ArrayList<>());
            }
            hm.get(s).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}