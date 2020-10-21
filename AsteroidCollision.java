class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        int n=asteroids.length;
        for(int i=0;i<n;i++)
        {
            if(asteroids[i]>0)
            {
                s.push(asteroids[i]);
            }
            else
            {
                while(!s.isEmpty() && s.peek()>0 && s.peek()<Math.abs(asteroids[i]))
                {
                    s.pop();
                }
                if(s.isEmpty() ||s.peek()<0 )
                    s.add(asteroids[i]);
                else if(s.peek()==Math.abs(asteroids[i]))
                {
                    s.pop();
                }
                
                
            }   
                
        }    
                
           int arr[]=new int[s.size()];
        for(int i=s.size()-1;i>=0;i--)
        {
            arr[i]=s.pop();
        }
                
                
                
            
            
            
         return arr;   
            
            
            
            
            
        
        
    }
}