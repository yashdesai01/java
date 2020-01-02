import java.util.*;
import java.io.*;
class student_pro12_1
{
	public static void main(String arg[])
	{
		student input=new student(2,"yash","male");
		input.display();
	}
}
class student
{
	private int rollno;
	private String name;
	private String gender;
	public student()
	{
		
	}
	public student(int rollno,String name,String gender)
	{
		this.rollno=rollno;
		this.name=name;
		this.gender=gender;
	}
	public void display()
	{
		System.out.println(rollno+" "+name+" "+gender);
	}
}