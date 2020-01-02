class palindrome
{
	public static void main(String[] a)
	{
		int no= Integer.parseInt(a[0]);
		int temp=no,rem=0,rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		
		}
		
		if(rev==no){
			System.out.println("Number is palindrome");
		}
		else{
				System.out.println("Number is Not palindrome");
		}
	}

}