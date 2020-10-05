/*class Solution {
    public int bitwiseComplement(int N) {
        if(N==0)
            return 1;
         StringBuffer sb=new StringBuffer();
        while(N>0)
        {
            int d=N%2;
            sb.append(String.valueOf(d));
            N=N/2;
            
        }
        sb.reverse();
        String str=sb.toString();
        StringBuffer sb1=new StringBuffer();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
                sb1.append("0");
            else
                sb1.append("1");
        }
        String str1=sb1.toString();
        
        int num=0;
        int base=1;
        for(int i=str1.length()-1;i>=0;i--)
        {
            int d=Integer.parseInt(str1.charAt(i)+"");
            num=num+base*d;
            base=base*2;
        }
        return num;
    }
}*/

class Solution {
    public int bitwiseComplement(int N) {
        if(N==0)
            return 1;
        int res=0;
        int i=0;
        while(N>0)
        {
            if((N&1)==0)
            {
                res=res|(1<<i);
                
            }
            N=N>>1;
            i++;
        }
        
        
        return res;
        
        
        
        
        
        
        
    }
}





