//................................bruteforce......o(n),o(1).................................
/*class Solution {
    public int minDominoRotations(int[] A, int[] B) 
    { int min=Integer.MAX_VALUE;
       for(int x=1;x<=6;x++)
       {
           min=Math.min(call(A,B,x),min);
           min=Math.min(call(B,A,x),min);
       }  
           return min==Integer.MAX_VALUE?-1:min;
       
        
        
        
    }
    private int call(int A[],int B[],int x)
    { int swaps=0;
       
            for(int i=0;i<A.length;i++)
            {
              if(A[i]==x)
                  continue;
                else if(A[i]!=x && B[i]==x)
                    swaps++;
                else
                    return Integer.MAX_VALUE;
                
            }   
                
                
             return swaps;   
            
           
            
            
            
        }
        
        
        
        
        
        
        
}*/       
  //......................................//3rd method........................................      
  class Solution {
    public int minDominoRotations(int[] A, int[] B)   
    { int n=A.length-1;
        int min=Integer.MAX_VALUE;
        min=Math.min(call(A,B,A[0]),min);
         min=Math.min(call(A,B,B[0]),min);
         min=Math.min(call(B,A,A[0]),min);
         min=Math.min(call(B,A,B[0]),min);
        
        return min==Integer.MAX_VALUE?-1:min;
        
    }
      private int call(int A[],int B[],int x)
      {
          int swaps=0;
          for(int i=0;i<A.length;i++)
          {
              if(A[i]==x)
                  continue;
              else if(A[i]!=x && B[i]==x)
                  swaps++;
              else
                  return Integer.MAX_VALUE;
              
              
              
              
          }
          
          return swaps;
          
          
          
          
          
          
      }
        
        
        
        
        
        
        
          
    
  }



































//2nd method.............................................o(n),o(n)...................................

/*class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        HashMap<Integer,Integer> h=new HashMap<>();
        //return Math.min(call(A,B,h),call(B,A,h));
        int d= call(A,B,h);
        int e=call(B,A,h);
        
        if(d==-1 || e==-1)
            return Math.max(d,e);
        return  Math.min(d,e);
    }
    private int call(int A[],int B[],HashMap<Integer,Integer> h)
    {
        for(int i=0;i<A.length;i++)
        {
            h.put(A[i],h.getOrDefault(A[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        int val=0;
        if(h.size()==1)
            return 0;
        for(int i:h.keySet())
        {
            if(h.get(i)>max)
            {
                max=h.get(i);
                val=i;
            }
        }
        int count=0;
        int f=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]!=val && B[i]==val)
               count++;
            else if(A[i]==val)
                f++;
        }
        h.clear();
         if((count+f)==A.length)
        return count;
        return -1;
        
        
        
    }
}*/










