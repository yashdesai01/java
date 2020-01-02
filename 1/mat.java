import java.util.*;
import java.io.*;

class mat
{
	public static void main(String arg[])
	{
		int i,j;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("\n Enter the value");
			int n=sc.nextInt();
			int  [][] a= new int [n][n];
				
				
				for (i=0;i<n;i++)
				{
						for (j=0;j<n;j++)
						{
							a[i][j] = sc.nextInt();
							
						}
						
				}
				System.out.println(a[i][j]);		
	}
}
