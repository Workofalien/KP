package com.pattern;

public class POOJA 
{
	void printPattern()
	{
        int n=5;
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)   ||  j!=n-2 && j!=n-1 
				if(i==0 || j==0 || i==(n-1)/2 || j==n-1 && i==1 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print(" ");
			
			
			for(int j=0;j<n;j++)
				{
					//if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)
					if(i==0 || j==0 || i==4 || j==4)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
					
				}
				System.out.print(" ");
				
				
				for(int j=0;j<n;j++)
					{
						//if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)
						if(i==0 || j==0 || i==4 || j==4)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					System.out.print(" ");
					
					for(int l=0;l<n;l++)
						{
							//if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)
							if( i==4 || l==n-1)
							{
								System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}
						}
						System.out.print(" ");
						
						for(int j=0;j<n;j++)
							{
								if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)
								{
									System.out.print("*");
								}
								else
								{
									System.out.print(" ");
								}
							}
							System.out.println(" ");
				
				
			
//			for(int j=0;j<n;j++)
//			{
//				//if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)   ||  j!=n-2 && j!=n-1 
//				if(i==0 || j==0 || i==(n-1)/2 || j==n-1 && i==1 )
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}	
//			}
//			System.out.println(" ");
//			
//		}System.out.println(" ");
//		
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				//if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)
//				if(i==0 || j==0 || i==4 || j==4)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//				
//				
//			}
//			System.out.println(" ");
//		}System.out.println(" ");
//		
//		for(int k=0;k<n;k++)
//		{
//			for(int l=0;l<n;l++)
//			{
//				//if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)
//				if(k==0 || l==0 || k==4 || l==4)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println(" ");
//		
//		}System.out.println(" ");
//		
//		for(int k=0;k<n;k++)
//		{
//			for(int l=0;l<n;l++)
//			{
//				//if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)
//				if( k==4 || l==n-1)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println(" ");
//		
//		}System.out.println(" ");
//		
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				if(i== (n-1)/2 || i==0  && j!=0 && j!= n-1 || j==n-1 || j==0)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println(" ");
		}
		
	}

}
