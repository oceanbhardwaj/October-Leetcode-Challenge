class Solution {//right rotate
    public void rotate(int[] nums, int k) {
      if(k>nums.length)
            k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
    }
    private void reverse(int nums[],int left,int right )
    {
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
            
        }
       
    }
}

/*class Solution {   ////o(n) spaces
    public void rotate(int[] nums, int k) {
        int arr[]=new int[nums.length];
        if(k>nums.length)
            k=k%nums.length;
        int j=0;
        int i=0;
        for( i=0;i<k;i++)
        {
            arr[k-i-1]=nums[nums.length-i-1];
        }
        int d=i;
        for(int i1=0;i1<nums.length-k;i1++)
        {
            arr[i1+k]=nums[i1];
        }
        
        for(i=0;i<nums.length;i++)
        {
            nums[i]=arr[i];
        }
       
        
        
        
        
        
        
        
        
        
    }
}*/