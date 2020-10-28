/*class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        ArrayList<String> a=new ArrayList<>();
        String s="";
        if(n==0)
            return a;
        String first=nums[0]+"";
        if(n==1)
        { a.add(first);
         return a;}
        String last="";
        int flag=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]-nums[i-1]==1 )
            {
                last=nums[i]+"";
                flag=1;
            }
            else
            { String s1="";
             
             if(!last.equals(""))
                 s1=first+"->"+last;
             else
                 s1=first;
             
                a.add(s1);
             flag=0;
                
            first=nums[i]+"";
            last="";}
            
        }
        String s1="";
       if(flag==0)
           s1=first;
        else
            s1=first+"->"+last;
        a.add(s1);
        return a;
    }
}*/
class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        ArrayList<String>a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
           String start=nums[i]+"";
            while(i+1<n && nums[i+1]==nums[i]+1)
                i++;
            if(!start.equals(nums[i]+""))
                a.add(start+"->"+nums[i]+"");
            else
                a.add(start);
                
                
        }

return a;
    }
}
