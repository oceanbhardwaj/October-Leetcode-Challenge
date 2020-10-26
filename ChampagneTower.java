class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        
        double[][] a=new double[102][102];
        a[0][0]=(double)poured;
        for(int row=0;row<=query_row;row++)
        {
            for(int col=0;col<=row;col++)
            {
               double q=(a[row][col]-1.0)/2.0;
                if(q>0)
                {
                    a[row+1][col]+=q;
                    a[row+1][col+1]+=q;
                }
            }
        }
        return Math.min(1,a[query_row][query_glass]);
    }
}