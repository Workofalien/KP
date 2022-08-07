package com.pattern;

public class Pattern5
{
	void printPattern()
	{
		int n=14;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)   ||  j!=n-2 && j!=n-1 
				if(
					i==0 || j==0 || i==n-1
				    || i==1 && (j==1 || j==2 || j==3 || j==4 || j==5)
				    || i==2 && (j==1 || j==2 || j==3 || j==4)
				    || i==3 && (j==1 || j==2 || j==3)
				    || i==4 && (j==1 || j==2)
				    || i==5 && j==1
				    || i==n-2 && (j==1 || j==2 || j==3 || j==4 || j==5 || j==6) 
				    || i==n-3 && (j==1 || j==2 || j==3 || j==4 || j==5) 
				    || i==n-4 && (j==1 || j==2 || j==3 || j==4)
				    || i==n-5 && (j==1 || j==2 || j==3)
				    || i==n-6 && (j==1 || j==2)
				    || i==n-7 && (j==1)
				  )
				  
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");	
		}
		System.out.println(" ");
		
		
//		for(int i=n/2;i>0;i--)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//		for(int i=0;i<n/2;i++)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
	}

}
