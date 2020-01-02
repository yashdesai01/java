class amrstrong
{
	public static void main(String a[])
	{
		int no,rem,sum=0;
		System.out.println(a[0]);
		no=Integer.parseInt(a[0]);
		//System.out.println(no);
		
		while(no!=0)
		{
			rem=no%10;
			sum=sum+rem*rem*rem;
			no=no/10;
		}
		System.out.println("Amrstrong Number=>"+sum);
	}
}