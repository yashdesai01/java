import java.sql.*;
class sql_demo
{
	public static void main(String args[])
	{
		try
		{
			//Class.forName("con.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/java","root","");
			Statement st = conn.createStatement();
			System.out.println("Id"+" "+"Name"+" "+"designation"+"Salary");
			ResultSet rs = st.executeQuery("SELECT * FROM emp");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString("emp_name")+" "+rs.getString(3)+" "+rs.getInt(4));
			}

			Statement st1 = conn.createStatement();
			String sql="insert into emp values(NULL,'deep','prof',25000)";
			st1.executeUpdate(sql);
			System.out.println();
			System.out.println("after update\n");
			
			rs = st.executeQuery("SELECT * FROM emp");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString("emp_name")+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}