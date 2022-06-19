// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  

// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long[] a = new long[n];
        long pro=1;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            count++;
            else
            pro*=nums[i];
        }
        if(count>1)
        return a;
        
        if(count==1)
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            a[i]=pro;
        }
        
        else
        {
            for(int i=0;i<n;i++)
            {
                a[i]=pro/nums[i];
            }
        }
        return a;
	} 
} 
