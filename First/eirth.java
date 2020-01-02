class operter
{
	public static void main(String[] a)
	{
		int no1 = Integer.parseInt(a[0]);
		char c = a[1].charAt(0);
		int no2 = Integer.parseInt(a[2]);
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