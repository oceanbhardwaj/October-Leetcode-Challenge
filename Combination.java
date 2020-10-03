class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        if(candidates.length==0)
            return result;
       Arrays.sort(candidates);
       // List<Integer> a1=new ArrayList();
        called(candidates,target, new ArrayList<>(),result,0);
        return result;
        
    }
    private void called(int candidates[],int target,List<Integer> a1, List<List<Integer>> result,int start)
    {
        if(target<0)
        { 
         return;
         
        }
       else if(target==0)
        {
            result.add(new ArrayList<>(a1));}
        else{
        for(int i=start;i<candidates.length;i++)
        {
            
            a1.add(candidates[i]);
            called(candidates,target-candidates[i],a1,result,i);
            a1.remove(a1.size()-1);
        }
        
        }
        
        
        
        
    }
}