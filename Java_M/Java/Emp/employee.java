package Emp;
import java.io.*;
public class employee implements Serializable  {
	private int empid;
	private String empname;
	private String empdes;
	private int sal;
	public employee(){}
	public employee(int empid,String empname,String empdes,int sal){
		this.empid=empid;
		this.empname=empname;
		this.empdes=empdes;
		this.sal=sal;
	}
	public void Display(){
		System.out.println("Employee ID:-"+this.empid);
		System.out.println("Employee Name:-"+this.empname);
		System.out.println("Employee Designation:-"+this.empdes);
		System.out.println("Employee Salary:-"+this.sal);
	}
}