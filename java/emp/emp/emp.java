package emp;
import java.io.*;
public class emp implements Serializable
{
	private int empid;
	private String ename;
	private int sal;
	public emp()
	{
		
	}
	public emp(int empid,String ename,int sal)
	{
		this.empid=empid;
		this.ename=ename;
		this.sal=sal;	
	}
	public void display()
	{
		System.out.println("emp id is:"+empid);
		System.out.println("emp name is:"+ename);
		System.out.println("emp sal is:"+sal);
	}
}