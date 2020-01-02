import java.util.*;
import java.io.*;
class area
{	
area(){}
area(int a){}
	public void rad()
	{
		double PI=3.14;
		double ans;
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter the radius=>");
		double radius=input.nextDouble();
		ans=(PI*radius*radius);
		System.out.print("\n ans=>"+ans);
	}
	public static void main(String a[])
	{
		area re=new area();
		re.rad();
		area re1=new area(10);
		System.out.print(re1);
	}
}