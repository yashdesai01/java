import java.util.*;
import MyPack.*;
import java.sql.*;
class Demo{
	public static void main(String args[]){
		try{
			boolean brk=true;
			int ch,id,age;
			String name;
			Scanner sc = new Scanner(System.in);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqljava","root","");
			PreparedStatement stmt;
			Statement st;
			ResultSet rs;
			while(brk){
				System.out.println("==== Services ====\n1.Insert\n2.Display\n3.Update\n4.Delete\n5.Exit");
				ch=sc.nextInt();
				switch(ch){
					case 1:
						System.out.println("Enter ID :");
						id = sc.nextInt();
						System.out.println("Enter Name :");
						name = sc.next();
						System.out.println("Enter Age :");
						age = sc.nextInt();
						
						if(age<0){
							throw new MyException(age);
						}
						
						stmt = con.prepareStatement("INSERT INTO std VALUES (?,?,?)");
						stmt.setInt(1,id);
						stmt.setString(2,name);
						stmt.setInt(3,age);
						if(stmt.executeUpdate()>0){
							System.out.println("Record Inserted");
						}
						else{
							System.out.println("Record Not Inserted");
						}
					break;
					case 2:
						st = con.createStatement();
						rs = st.executeQuery("SELECT * FROM std");
						System.out.println("\n--------- Records ---------\n");
						System.out.println("ID\tName\tAge\n");
						while(rs.next()){
							System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+rs.getInt("age"));
						}
						System.out.println("\nAll Records Displayed\n");
					break;
					case 3:
					break;
					case 4:
					break;
					case 5:
					brk=false;
					break;
				}
					
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}