import java.util.*;
class MyException extends Exception
{
	int age;
	public MyException(int age)
	{
		this.age=age;
	}
	public String toString()
	{
		return "age can't be nagative "+age;
	}
}
class TestAge
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		try
		{
			System.out.println("\n Enter the age");
			int a=input.nextInt();
			if(a<0)
				throw new MyException(a);
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}