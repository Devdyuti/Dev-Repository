import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**Testing purpose only 
 * no use in the Application 
 * */

class DBConn{
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		Connection conn=null;
		try{
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","root");
		}catch (SQLException e) {
			System.out.println("Connection not established: "+e);
		}
		return conn;
	}
}
public class Test {
	
	public static Connection conn=null;
	public static ResultSet rs=null;
	public static PreparedStatement ps=null;
	
	public static void main(String[] args) {
		try{
			conn=DBConn.getConnection();
			ps=conn.prepareStatement("insert into USERPOC.TEST(name,id) values(?,?)");
			ps.setString(1, "Singh");
			ps.setInt(2, 2);
			ps.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
