class Solution {
    public String removeDuplicateLetters(String s) {
        if(s.length()==0)
            return "";
        Stack<Character> stack=new Stack<>();
        HashMap<Character,Integer> h=new HashMap<>();
        ArrayList<Character> a=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
            
        }
        for(char c1:s.toCharArray())
        {
            if(!a.contains(c1))
            {
               a.add(c1);
                if(stack.size()>0 && c1<stack.peek())
                {
                    char ch=stack.peek();
                    while(!stack.isEmpty() && c1<ch && h.get(ch)>0)
                    { int d=a.indexOf(ch);
                        a.remove(d);
                        stack.pop();
                        if(stack.size()>0)
                            ch=stack.peek();
                        
                        
                        
                        
                    }
                    
                 }
            
          stack.add(c1);
            }
            h.put(c1,h.get(c1)-1);
         }
           StringBuffer sb=new StringBuffer();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        sb.reverse();
        String g=sb.toString();
        return g;
        
    }
}