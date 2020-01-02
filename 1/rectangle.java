// chain is one function pass to prent function pass the value 
import java.io.*;
public class rectangle
{
	float length;
	float breadth;
	float ans;
	static int count;
	rectangle()
	{
		length=0.00f;
		breadth=0.00f;
	}
	rectangle(float length,float breadth)
	{
		this();
		this.length=length;
		this.breadth=breadth;
	}
	rectangle(rectangle r1)
	{
		this(r1.length,r1.breadth);
		length=r1.length;
		breadth=r1.breadth;
	}
	{
		count++;
	}
	static int getcount()
	{
		return count;
	}
	void display()
	{
		ans=length*breadth;
		//return ans;
		System.out.println("ans=>"+ans);
	}
	public static void main(String arg[])
	{
		rectangle re1 = new rectangle();
		rectangle re2 = new rectangle(5,6);
		rectangle re3 = new rectangle(re2);
		System.out.println("re2=>"+re2);
		System.out.println("re3=>"+re3);
		re2.display();
		//System.out.println(re2.display());
		System.out.println("object is created=>"+count);		
	}
}