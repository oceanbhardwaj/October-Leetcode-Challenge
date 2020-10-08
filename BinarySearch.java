class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0)
            return 0;
        int left=0;
        int right=nums.length-1;
        int res=-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==target)
            {
                res=mid;
                break;
            }
            else if(nums[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
                
        }
        return res;
        
    }
}