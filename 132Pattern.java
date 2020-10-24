/*class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
        if(n<3)
            return false;
        int flag=0;
        for(int i=0;i<n-2;i++)
        {  
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(nums[k]>nums[i] && nums[k]<nums[j])
                    {
                        flag=1;
                        break;
                    }
                    
                }
                if(flag==1)
                    break;
                
                
            }
            if(flag==1)
                        break;
        }
                
          if(flag==1)
              return true;
        else
             return false;    
                
            
       
    }
}*/


..................................................................................................................................................................................................................................................................

//o(n2)
/*class Solution {
    public boolean find132pattern(int[] nums) {
 int n=nums.length;
        if(n==0||n<3)
            return false;
       int min=nums[0];
        for(int j=1;j<n-1;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                if(min<nums[k] && nums[k]<nums[j])
                    return true;
                
            }
            min=Math.min(min,nums[j]);
            
                
        }
        return false;
    }
}*/

//..................................................................................//efficient//...........................o(n)..........................................................................................
class Solution {
    public boolean find132pattern(int[] nums) {
 int n=nums.length;
        if(n==0||n<3)
            return false;
        Stack<Integer> s=new Stack<>();
        int min[]=new int[nums.length];
         min[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            min[i]=Math.min(min[i-1],nums[i]);
        }
        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]>min[i])
            {
                while(!s.isEmpty() && s.peek()<=min[i] )
                    s.pop();
            
            if(!s.isEmpty() && s.peek()<nums[i])
                return true;
                 s.push(nums[i]); 
            }
       
        }
        
        
        
        return false;
        
        
        
        
        
        
        
    }
}












