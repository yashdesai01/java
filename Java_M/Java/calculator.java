//Write a java program to make calc using switch case
public class calculator
{
	public static void main(String[] args)
	{
		switch(args[1].charAt(0))
		{
			case '+' :	System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[2]));
			break;
			case '-' :	System.out.println(Integer.parseInt(args[0])-Integer.parseInt(args[2]));
			break;
			case '*' :	System.out.println(Integer.parseInt(args[0])*Integer.parseInt(args[2]));
			break;
			case '/' :	System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[2]));
			break;
			default  :	System.out.println("Wrong Equation!!!");
		}
	}
}