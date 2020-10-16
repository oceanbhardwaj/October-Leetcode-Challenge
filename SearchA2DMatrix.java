/*class Solution {         //o(n2)
    public boolean searchMatrix(int[][] matrix, int target) {
       
       int n=matrix.length;
        if(n==0)
           return false;
        int m=matrix[0].length;
        if( m==0)
            return false;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==target)
                    return true;
            }
        }
        
        return false;
    }
}*/
//second method........................................................................
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
         int n=matrix.length;
        if(n==0)
           return false;
        int m=matrix[0].length;
        if( m==0)
            return false;
        int i=0;
        int j=m-1;
        
        while(i>=0 && i<n && j>=0 && j<m)
        {
            if(matrix[i][j]==target)
                return true;
            else if(target<matrix[i][j])
            {
                j--;
                
            }
            else if(target>matrix[i][j])
            {
                i++;
                
            }
            
            
            
            
        }
        return false;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
        
        
        
        
        
       