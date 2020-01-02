import java.util.*;
class divide
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		try
		{
			System.out.print("\n Enter the No1=>");
			int no1=input.nextInt();
			System.out.print("\n Enter the No2=>");	
			int no2=input.nextInt();
			int ans=no1/no2;
			System.out.print("\n"+ans);
		}
		catch(ArithmeticException e)
		{
			System.out.println("\n ZERO DIVIDE BY ZERO");
		}
	}
}