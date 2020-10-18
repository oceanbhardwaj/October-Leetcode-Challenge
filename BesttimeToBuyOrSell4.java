class Solution {
    public int maxProfit(int k, int[] prices) {
        if(prices.length<=1)
            return 0;
        int sum=0;
        if(k>(prices.length/2))  //infinite traction
        {
            for(int i=0;i<prices.length-1;i++)
            {
                if(prices[i]<prices[i+1])
                    sum=sum-prices[i]+prices[i+1];
            }
           return sum;
        }
        else
        {
          HashMap<String,Integer> h=new HashMap<>();
            return call(0,prices,0,k,h);
        } 
            
    }
    private int call(int i,int prices[],int buyorsell,int k,HashMap<String,Integer> h)
    {
        if(i>=prices.length || k==0)
            return 0;
        String s=i+"A"+buyorsell+"B"+k;
        if(h.containsKey(s))
            return h.get(s);
        int x=0;
        if(buyorsell==0)
        { int buy=call(i+1,prices,1,k,h)-prices[i];
         int nobuy=call(i+1,prices,0,k,h);
         x=Math.max(buy,nobuy);
            
        }
        else if(buyorsell==1)
        {
            int sell=call(i+1,prices,0,k-1,h)+prices[i];
        int nosell=call(i+1,prices,1,k,h);
            x=Math.max(sell,nosell);
            }
        h.put(s,x);
        return x;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
            
            
            
            
            
        
            
            
            
            
        
        
    
}