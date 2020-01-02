//WAP to add two numbers and the numbers should be entered using commandline arguments
public class AddNumbersCLI
{
	public static void main(String[] args)
	{
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
	}
}