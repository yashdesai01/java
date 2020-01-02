package student;
	public class student
	{
		int rollno;
		String fname,mname,lname,div,coures;
	
		public student()
		{
			
		}
		public student(int rollno,String fname,String mname,String lname,String coures,String div)
		{
			this.rollno=rollno;
			this.fname=fname;
			this.mname=mname;
			this.lname=lname;
			this.coures=coures;
			this.div=div;
		}
		public void display()
		{
			System.out.println("Roll_no is=>"+rollno);
			System.out.println("First_Name=>"+fname);
			System.out.println("Middle_Name=>"+mname);
			System.out.println("Last_Name is=>"+lname);
			System.out.println("Coures is=>"+coures);
			System.out.println("Div is=>"+div);
		}
	}
 
