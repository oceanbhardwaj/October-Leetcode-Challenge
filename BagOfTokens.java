class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        int n=tokens.length;
        Arrays.sort(tokens);
        int score=0;
      int left=0;
        int right=n-1;
        int max=0;
        while(left<=right)
        {
         if(P>=tokens[left])
         {
             score++;
             P=P-tokens[left++];
             max=Math.max(max,score);
         }
            else if(score>0)
            {
                score--;
                P=P+tokens[right--];
            }
            else 
            {
                break;
            }
            
            
            
            
            
        }
        return max;
    }
}