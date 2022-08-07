package com.pattern;

public class INEURON 
{
	void printPattern()
	{
		int n=5;
		
		
		for(int i=0;i<n;i++)
		{
				if( i==0 || i==1 || i==2 || i==3 || i==4)
				{
					System.out.println("*");
				}
				else
				{
					System.out.println(" ");
				}
		}System.out.println(" ");
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)
				if( j==0  || j==4 || i==1 && j==1 || i==2 && j==2 || i==3 && j==3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				
			}
			System.out.println(" ");
		}System.out.println(" ");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)
				if(i==0 || j==0 || i==4 || i==2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				
			}
			System.out.println(" ");
		}System.out.println(" ");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)
				if(j==0 || i==4 || j==4 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				
			}
			System.out.println(" ");
		}System.out.println(" ");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)
				if(i==0 || j==0 || i==2 || i==1 && j==4 || i==3 && j==2 || i==4 && j==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				
			}
			System.out.println(" ");
		}System.out.println(" ");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)
				if(i==0 || j==0 || j==4 || i==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				
			}
			System.out.println(" ");
		}System.out.println(" ");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)
				if( j==0  || j==4 || i==1 && j==1 || i==2 && j==2 || i==3 && j==3)
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
	}//end of method
}
