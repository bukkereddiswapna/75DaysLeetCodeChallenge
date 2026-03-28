class Solution {
    public int characterReplacement(String s, int k) {
        int f[]=new int[26];
        int max=0;
        int l=0;
        int maxf=0;
        for(int r=0;r<s.length();r++)
        {
            char c=s.charAt(r);
            f[c-'A']++;
            maxf=Math.max(maxf,f[c-'A']);
            while((r-l+1)-maxf>k)
            {
                f[s.charAt(l)-'A']--;
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}