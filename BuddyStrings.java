class Solution {
    public boolean buddyStrings(String A, String B) {
        char ch1[]=A.toCharArray();
        char ch2[]=B.toCharArray();
       if(A.length()!=B.length())
           return false;
        ArrayList<Integer> h=new ArrayList<>();
        HashSet<Character> set=new HashSet<>();
        if(A.equals(B))
        {
            for(char c:ch1)
            {
                set.add(c);
            }
            return set.size()<B.length();
        }
        
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)!=B.charAt(i))
                h.add(i);
            if(h.size()==2)
                break;
        }
        if(h.size()==2)
        { int d1=h.get(0);
        int d2=h.get(1);
        char temp=ch1[d1];
        ch1[d1]=ch1[d2];
        ch1[d2]=temp;}
        String a=new String(ch1);
        if(a.equals(B))
            return true;
        else 
            return false;
        
    }
}