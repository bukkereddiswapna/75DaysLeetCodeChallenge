class Solution {
    public boolean isAnagram(String s, String t) {
        char[] unsort_s=s.toCharArray();
        char[] unsort_t=t.toCharArray();
        Arrays.sort(unsort_s);
        Arrays.sort(unsort_t);
        String sort_s=new String(unsort_s);
        String sort_t=new String(unsort_t);
        boolean found=false;
        if(sort_s.equals(sort_t))
        {
            found=true;
        }
    return found;
    }
}