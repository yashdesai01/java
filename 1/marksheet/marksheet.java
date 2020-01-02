import student.student;
import exam.Result;
class marksheet
{
	public static void main(String a[])
	{
		student s1=new student();
		student s2=new student(1,"Sarvaiya","yash","gautambhai","MCA","B");
		
		Result r1=new Result();
		exam.Result r2=new exam.Result(75,78,80,70);
		
		s1.display();
		r1.display();
		r1.avg();
	}
}