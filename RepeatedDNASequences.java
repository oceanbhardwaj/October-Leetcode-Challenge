class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        ArrayList<String> a=new ArrayList<>();
        if(s.length()<10)
            return a;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<=s.length()-10;i++)
        {
            String s1=s.substring(i,i+10);
            if(map.containsKey(s1) && !a.contains(s1))
            {
                a.add(s1);
            }
            else
            {
                map.put(s1,1);
            }
        }
        return a;
    }
}