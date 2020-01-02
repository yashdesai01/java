import java.util.*;
import java.io.*;
class max
{
	public static void main(String a[])
	{
		Scanner s1=new	Scanner(System.in);
		System.out.println("Enter no1=>");
		int no1=s1.nextInt();
		
		System.out.println("Enter no2=>");
		int no2=s1.nextInt();
		
		System.out.println("Enter no3=>");
		int no3=s1.nextInt();
		
		
		//int max=(no1>no2 && no1>no3)?no2:no3;
		//int max1=(no2>no1 && no2>no3)?no2:no3;
		//int max2=(no3>no1 && no3>no2)?no1:no2;
		
		int max=(no1>no2)?(no1>no3)?no1:no3:(no2>no3)?no2:no3;
		
		System.out.println(max);
		//System.out.println(max2);
		//System.out.println(max2);
	}
}