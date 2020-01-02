import java.util.Scanner;
class armstrong
{
	public static void main(String[] a)
	{
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int temp=no,sum=0,rem;
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			sum=sum+(rem*rem*rem);
		}
		if(sum==temp)
		{
			System.out.println("is armstrong");
		}
		else
		{
			System.out.println("is not armstrong");
		}
	
	}
}