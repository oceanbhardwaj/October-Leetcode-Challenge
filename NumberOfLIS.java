class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int lis[]=new int[n];
        Arrays.fill(lis,1);
        int count[]=new int[n];
        Arrays.fill(count,1);
        int max=1;
        for(int i=1;i<n;i++)
        {  
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j] && lis[j]+1>lis[i])
                { lis[i]=lis[j]+1;
                 
                 count[i]=count[j];
                 }
                else if(lis[j]+1==lis[i] && nums[i]>nums[j])
                    count[i]=count[i]+count[j];
                
                max=Math.max(max,lis[i]);
            }
        }
        int count1=0;
        for(int i=0;i<n;i++)
        {
            if(lis[i]==max)
                count1=count1+count[i];
        }
        return count1;
        }
}