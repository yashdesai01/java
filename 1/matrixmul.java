import java.util.*;
import java.io.*;

class matrixmul
{
	public static void main(String arg[])
	{
			int i,j,k;
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the size of matrix=>");
			int n = input.nextInt();
			int [][] a= new int [n][n];
			int [][] b= new int [n][n];
			int [][] c= new int [n][n];
			
			System.out.println("\n Enter the Element of 1 Matrix");
			for (i=0;i<n;i++)
			{
					for (j=0;j<n;j++)
					{
						a[i][j] = input.nextInt();							
					}					
			}
			
			System.out.println("\n Enter the Element of 2 Matrix");			
			for (i=0;i<n;i++)
			{
					for (j=0;j<n;j++)
					{
						b[i][j] = input.nextInt();							
					}	
			}
			
			System.out.println("\n 1 Matrix");
			for (i=0;i<n;i++)
			{
					for (j=0;j<n;j++)
					{
						System.out.print(" "+a[i][j]);							
					}	
						System.out.println();
			}
			
			System.out.println("\n 2 Matrix");
			for (i=0;i<n;i++)
			{
					for (j=0;j<n;j++)
					{
						System.out.print(" "+b[i][j]);							
					}	
						System.out.println();
			}
			
			System.out.println("\n Multiply the Matrices...");
			for (i=0;i<n;i++)
			{
					for (j=0;j<n;j++)
					{
						for(k=0;k<n;k++)
						{
							c[i][j] = c[i][j] + a[i][k] * b[k][j];					
						}
					}	
			}
			
			System.out.println("\n The product is...");
			for (i=0;i<n;i++)
			{
					for (j=0;j<n;j++)
					{
						System.out.print(" "+c[i][j]);
					}	
					System.out.println();
			}
	}
}
