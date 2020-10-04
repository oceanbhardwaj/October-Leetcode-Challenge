class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Comparator co=new Comparator<int[]>(){
            public int compare(int a[],int b[])
            {
                if(a[0]==b[0])
                   return b[1]-a[1];
                return a[0]-b[0];
            }
        };
        Arrays.sort(intervals,co);
        int length=intervals.length;
        if(length==0)
            return 0;
        int count=0;
        
       int l=intervals[0][0];
       int m=intervals[0][1];
        for(int i=1;i<length;i++)
        {
            int d=intervals[i][0];
            int e=intervals[i][1];
            if(l<=d && m>=e  )
                count++;
            if(d>=l)
                l=d;
            if(e>=m)
                m=e;
        }
        return length-count;
    }
}