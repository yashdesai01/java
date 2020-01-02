import java.sql.*;
public class mysql_demo
{
	public static void main(String[] args) {
		try{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/java","root","");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from employee");
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			Statement st2 = conn.createStatement();
			/*String sql = "insert into employee values(NULL,'Rohan','Panchal',18000)";
			st2.executeUpdate(sql);*/
			rs = st.executeQuery("select * from employee");
			System.out.println("After Updating Data");
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			conn.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		try{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/java","root","");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from employee");
			while(rs.first())
			{
				String s = rs.getString(1);
				System.out.println(s);
				break;
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}