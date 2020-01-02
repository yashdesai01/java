import java.util.Scanner;
class eirth
{
	public static void main(String[] a)
	{
		Scanner sc=new Scanner(System.in);
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		char c=sc.next().charAt(0);
		int ans;
		
		switch(c)
		{
			case '+':
						ans=no1+no2;
						System.out.println(ans);
						break;
			
			case '-':
						ans=no1-no2;
						System.out.println(ans);
						break;
	
			case '*':
						ans=no1*no2;
						System.out.println(ans);
						break;	
			
			case '/':
						ans=no1/no2;
						System.out.println(ans);
						break;
		
			default:
					System.out.println("Wrong Choice!!!");
		}
		
	
	}

}