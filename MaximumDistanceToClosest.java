/*class Solution {
    public int maxDistToClosest(int[] seats) {
        ArrayList<Integer> a=new ArrayList<>();
        int n=seats.length;
        for(int i=0;i<n;i++)
        {   if(seats[i]==1)
            a.add(i);
        }
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(seats[i]==0)
            {
                for(int j:a)
                {
                    min=Math.min(min,Math.abs(i-j));
                }
                max=Math.max(max,min);
                min=Integer.MAX_VALUE;
            }
            
        }
        return max;
        
    }
}*/

class Solution {
    public int maxDistToClosest(int[] seats) {
         int n=seats.length;
        int left[]=new int[n];
        int right[]=new int[n];
        Arrays.fill(left,n);
        Arrays.fill(right,n);
        for(int i=0;i<n;i++)
        {
            if(seats[i]==1)
                left[i]=0;
            else if(i>0)
                left[i]=left[i-1]+1;
        }
        
        for(int i=n-1;i>=0;i--)
        {
            if(seats[i]==1)
                right[i]=0;
            else if(i<n-1)
                right[i]=right[i+1]+1;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,Math.min(left[i],right[i]));
        }
        return max;
        
        
        
        
        
        
        
        
        
        
    }
}






        
        