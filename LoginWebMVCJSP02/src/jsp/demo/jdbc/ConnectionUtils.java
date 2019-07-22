/**
 * 
 */
package jsp.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author TechCare
 *
 */
public class ConnectionUtils {
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		String hostName = "localhost";
		String dbName = "unify";
		String userName = "root";
		String password = "123456";
		return getMyConnection(hostName, dbName, userName, password);
	}

	public static Connection getMyConnection(String hostName, String dbName, String userName, String password)
			throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");

		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		System.out.println(getMyConnection());
	}
}
