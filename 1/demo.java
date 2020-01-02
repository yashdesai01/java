import java.io.*;
import java.util.Scanner;
abstract class account
{
	int a_no;
	float a_balance;
	account(){}
	account(int a_no,float a_balance)
	{
			this.a_no=a_no;
			this.a_balance=a_balance;
	}
	public float check_balance()
	{
		return a_balance;
	}
	abstract float deposite(float rupees,float a_balance);
	abstract float withdraw(float rupees,float a_balance);
	//abstract float check_balance();
	public void display()
	{
		System.out.println("account is"+a_no);
		System.out.println("account balance is"+a_balance);
	}
}
class saving extends account
{
	float interestRate;
	float rupees;
	//float time;
	public saving(){}
	public saving(int a_no,float a_balance,float interestRate,float rupees)
	{
		super(a_no,a_balance);
		this.interestRate=interestRate;
		this.rupees=rupees;
		//this.time=time;
	}
	public float deposite(float rupees,float a_balance)
	{
		a_balance=a_balance+rupees;
		return a_balance;
	}
	public float check_balance()
	{
		return a_balance;
	}
	public float withdraw(float rupees,float a_balance)
	{
		a_balance=a_balance-rupees;
		if(a_balance<0)
		{
			System.out.println("\n Insffeicient Balance");
			a_balance=a_balance+rupees;
		}
		return a_balance;
	}
	public void display()
	{
		super.display();
		System.out.println("account is"+a_balance);
		System.out.println("account balance is"+rupees);
	}
}
class current extends account
{
	float od_limit;
	float rupees;
	String s;
	//float time;
	public current(){}
	public current(int a_no,float a_balance,float od_limit,float rupees)
	{
		super(a_no,a_balance);
		this.rupees=rupees;
		this.od_limit=od_limit;
	}
	public float deposite(float rupees,float a_balance)
	{
		a_balance=a_balance+rupees;
		return a_balance;
	}
	public float check_balance()
	{
		return a_balance;
	}
	public float withdraw(float rupees,float a_balance)
	{
		a_balance=a_balance-rupees;
		if(a_balance<0)
		{
			System.out.println("Insffeicient Balance");
			System.out.println("Enter the choice:(Y/N)?");
			Scanner sc = new Scanner(System.in);
			s=sc.next();
			if(s=="y")
			{
				System.out.println("Enter the od amount=>");
				int od_amount=sc.nextInt();
				if(od_amount>od_limit)
				{
					System.out.println("od_limit is lower then od_amount");
				}
			}
			else
			{
				return a_balance;
			}
			//a_balance=a_balance+rupees;
		}
		return a_balance;
	}
	public void display()
	{
		super.display();
		System.out.println("account is"+a_balance);
		System.out.println("account balance is"+rupees);
	}
}
class demo
{
	public static void main(String arg[])
	{
		
		saving s1=new saving();
		saving s2=new saving(11,2000,5,5000);
		s2.deposite(2000,5000);
		s2.withdraw(2000,5000);
		s2.check_balance();
		s2.display();
		
		current cs=new current();
		current cs2=new current(12,15000,50000,600000);
		cs2.display();
	}
}