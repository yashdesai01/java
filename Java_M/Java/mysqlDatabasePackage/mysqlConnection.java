package mysqlDatabasePackage;
import java.sql.*;
class mysqlConnection{
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/java","root","")
}