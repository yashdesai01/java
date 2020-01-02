import java.io.*;
class fact
{
	public static void main(String arg[])
	{
		int no,fact=1;
		System.out.println(arg[0]);
		no=Integer.parseInt(arg[0]);
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}		
	}
}