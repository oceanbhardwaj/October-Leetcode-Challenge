/*package whatever //do not write package name here */

import java.util.*;

public class PolycarpTraining {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int count=0;
		int day=1;
		for(int i=0;i<n;i++)
		{ if(arr[i]>=day)
		{
		    count++;
		    day++;
		}
                                    		    
		    
		}
		System.out.println(count);
	} 
}