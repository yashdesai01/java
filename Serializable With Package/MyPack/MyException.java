package MyPack;

public class MyException extends Exception
{
	int age;
	public MyException(int age)
	{
		this.age=age;
	}
	public String toString(){
		return "Invalid Age: "+age;
	} 
}