/**
 * 
 */
package vn.demo.utils;

/**
 * @author TechCare
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		String hostName = "localhost";
		String dbName = "demo";
		String userName = "root";
		String password = "123456";
		return getMyConnection(hostName, dbName, userName, password);
	}

	public static Connection getMyConnection(String hostName, String dbName, String userName, String password)
			throws SQLException, ClassNotFoundException {
		// Khai báo class Driver cho DB MySQL
		// Việc này cần thiết với Java 5
		// Java6 trở lên tự động tìm kiếm Driver thích hợp.
		// Nếu bạn dùng Java > 5, thì ko cần dòng này cũng được.
		Class.forName("com.mysql.jdbc.Driver");

		// Cấu trúc URL Connection dành cho MySQL
		// Ví dụ: jdbc:mysql://localhost:3306/learning_sql
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}
}
