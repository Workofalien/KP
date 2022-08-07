package com.pattern;

public class Pattern3 
{
	void printPattern()
	{
		int n=14;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//(i==(n-1)/2 && j==1 || i==(n-1)/2 && j== n-2)  (j==1 && i==1 || j==1 && i==(n-1)/2)i==2 && j!=(n-2)/2 ||
				if
				(
					i==0 || j==0 || i== n-1 || j==n-1 || i==1 || (i==2 && j!=(n-1)/2) 
					|| i==3 && (j==1 ||j==2||j==3||j==4||j== n-2||j== n-3||j== n-4||j== n-5||j== n-6) 
					|| i==4 && (j==1||j==2||j==3||j== n-2||j== n-3||j== n-4||j== n-5) 
					|| i==5 && (j==1||j==2||j== n-2||j== n-3||j== n-4)
					|| i==(n-1)/2 && (j==1 || j== n-2 || j== n-3 || j==n-2)	
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
	}

}
