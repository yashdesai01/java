package emp;
import java.io.*;
public class testemp
{
	public static void main(String [] args)
	{
		try
		{
			FileOutputStream fout=new  FileOutputStream("abc.txt");
			ObjectOutputStream obj=new ObjectOutputStream(fout);
			
			emp e=new emp(1,"aaa",1000);
			obj.writeObject(e);
			obj.close();
			fout.close();
			
			FileInputStream fin=new FileInputStream("abc.txt");
			ObjectInputStream oin=new ObjectInputStream(fin);
			emp em=(emp) oin.readObject();
			em.display();
			fin.close();
			oin.close();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
}