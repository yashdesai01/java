package Emp;
import java.io.*;
public class testemp{
	public static void main(String[] args) {
		try{
			FileOutputStream fos = new FileOutputStream("abc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			employee ew = new employee(1,"Mohit","Developer",15000);
			oos.writeObject(ew);
			oos.close();
			fos.close();
			FileInputStream fis = new FileInputStream("abc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			employee er = (employee)ois.readObject();
			er.Display();
			ois.close();
			fis.close();
		}	
		catch(Exception e){
			e.printStackTrace();
		}
	}
}