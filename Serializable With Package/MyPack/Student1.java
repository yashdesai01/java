package MyPack;
import java.io.*;
public class Student1 implements Serializable{
	int roll,age;
	String fname,lname,mname,add;
	public Student1(int r,int a,String f,String m,String l,String add){
		roll=r;
		age=a;
		fname=f;
		mname=m;
		lname=l;
		this.add=add;
	}
	public int getAge(){
		return age;
	}
	public int getRoll(){
		return roll;
	}
	public void Display(){
		System.out.println(roll+"\t"+fname+"\t"+mname+"\t"+lname+"\t"+add+"\t"+age+"\t");
	}
}