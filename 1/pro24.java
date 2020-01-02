import java.util.Scanner;

interface exam
{
	boolean pass(int mark);
}

interface classify
{
	String Division(int avg);
}

class Result implements exam,classify 
{
	public boolean pass(int mark)
	{
		if(mark>=50)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String Division(int avg)
	{
		if(avg>=60)
			return "First";
		else if((avg>=50) && (avg<60))
			return "second";
		else
			return "no Division";
	}
}
public class pro24
{
	public static void main(String a[])
	{

		Result e=new Result();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the mark");
		int mark=input.nextInt();
		
		System.out.println("Enter the avg");
		int avg=input.nextInt();
		
		System.out.println(e.pass(mark));
		System.out.println(e.Division(avg));
	}
}

//pro26

