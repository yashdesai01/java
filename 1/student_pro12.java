import java.util.*;
import java.io.*;
class student_pro12
{
	public static void main(String arg[])
	{
		student input = new student();
		// System.out.print("\n Enter the NO=>");
		// int no=input.nextInt();
		// System.out.print("\n Enter the Name=>");
		// int na=input.nextString();
		// System.out.print("\n Enter the Gender=>");
		// int gen=input.nextString();
		
		input.setRollno(48);
		input.setName("\n"+"SARVAIYA YASH");
		input.setGender("\n"+"MALE");
		System.out.println(input.getRollno()+input.getName()+input.getGender());
	}
}
class student
{
	private int rollno;
	private String name;
	private String gender;
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public String getGender()
	{
		return gender;
	}	
}