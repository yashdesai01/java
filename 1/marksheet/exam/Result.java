package exam;

	public class Result
	{
		int sub1,sub2,sub3,sub4,ans;
		float avg;
		public Result()
		{
			
		}
		public Result(int sub1,int sub2,int sub3,int sub4)
		{
			this.sub1=sub1;
			this.sub2=sub2;
			this.sub3=sub3;
			this.sub4=sub4;
		}
		public void avg()
		{
			ans=sub1+sub2+sub3+sub4/4;
			System.out.println("Avg is=>"+ans);
		}
		public void display()
		{
			//ans=sub1+sub2+sub3+sub4/4;
			System.out.println("Python=>"+sub1);
			System.out.println("DBMS=>"+sub2);
			System.out.println("JAVA=>"+sub3);
			System.out.println("BM=>"+sub4);
			//System.out.println("Ans is=>"+ans)
		}
	}
