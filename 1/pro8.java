import java.util.*;
import java.io.*;
class pro8
{
	public static void main(String a[])
	{
		int ary[]=new int[50];
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Element=>");
		int no=s1.nextInt();
		int sum=0;
		for(int i=0;i<no;i++)
		{
				ary[i]=s1.nextInt();
				sum=sum+ary[i];
		}
		for(int i=0;i<no;i++)
		{
			System.out.println("Array is "+"["+(i+1)+"]"+"=>"+ary[i]);
		}
		System.out.println("Array of sum=>"+sum);
	}
}