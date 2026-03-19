class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char []c=s.toCharArray();
        String res="";
        for(int i=0;i<c.length;i++)
        {
           if(Character.isLetterOrDigit(c[i]))
           {
            res+=c[i];
           }
        }
        char b[]=res.toCharArray();
        String rev="";
        for(int i=b.length-1;i>=0;i--)
        {
           rev+=b[i];
        }
        if(res.equals(rev))
        {
            return true;
        }
        return false;
    }
}