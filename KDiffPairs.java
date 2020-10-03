/*class Solution {        //o(n2)
    public int findPairs(int[] nums, int k) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            
            for(int j=i+1;j<nums.length;j++)
            {  ArrayList<Integer> a=new ArrayList<>();
                if(Math.abs(nums[i]-nums[j])==k)
                {
                    a.add(nums[i]);
                    a.add(nums[j]);
                    Collections.sort(a);
                    if(!res.contains(a))
                        res.add(a);
                }
                
                
            }
        }
        return res.size();
    }
}*/


//O(n)
class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
        if(k<0)
            return 0;
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(int j:h.keySet())
        {
            if(k==0)
            {
                if(h.get(j)>=2)
                    count++;
            }
            else if(h.containsKey(j+k))
                
            {
                count++;
            }
        }
        
        
        return count;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}