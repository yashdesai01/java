import java.io.*;
class sql_demo2
{
	try
	{
		Connection conn = DrvierManager.getConnection("jdbc:mysql://localhost/java","root","");
		Statement st = conn.creatStatement();
		System.out.println("Id"+"NAME"+"DESIGNATION"+"SALARY");
		Resultset rs=st.executeQuery("SELECT * FROM emp");
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}