class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<Integer>();
        for(String t:tokens)
        {
            if(t.equals("+"))
            {
                s.push(s.pop()+s.pop());
            }
            else if(t.equals("-"))
            {
                int b=s.pop();
                int a=s.pop();
                s.push(a-b);
            }
            else if(t.equals("*"))
            {
                s.push(s.pop()*s.pop());
            }
            else if(t.equals("/"))
            {
                 int b=s.pop();
                int a=s.pop();
                s.push(a/b);
            }else{
                s.push(Integer.parseInt(t));
            }
        }
        return s.pop();
    }
}