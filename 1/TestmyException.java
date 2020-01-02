import java.util.*;
class MyException extends Exception
{
	public MyException()
	{
		super();
	}
	public String toString()
	{
		return "DivideBy Zero user defined";
	}
}
class TestmyException
{
	public static void main(String args[])
	{
		try
		{
			int a=10;
			int b=0;
			int c;
			if(b==0)
				throw new MyException();
			else
				c=a/b;
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}