/**
 * 
 */
package jsp.examples.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author TechCare
 *
 */
public class QueryDataExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Lấy ra đối tượng Connection kết nối vào DB.
		Connection connection = ConnectionUtils.getMyConnection();

		// Tạo đối tượng Statement.
		Statement statement = connection.createStatement();

		String sql = "Select ID, NAME, AGE, SALARY from customers";

		// Thực thi câu lệnh SQL trả về đối tượng ResultSet.
		ResultSet rs = statement.executeQuery(sql);

		System.out.println("--------SELECT------------");
		// Duyệt trên kết quả trả về.
		while (rs.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
			int id = rs.getInt(1);
			String name = rs.getString("NAME");
			int age = rs.getInt(3);
			double salary = rs.getDouble(4);
			
			
			System.out.println("--------------------");
			System.out.println("Id:" + id);
			System.out.println("Name:" + name);
			System.out.println("Age:" + age);
			System.out.println("Salary:" + salary);
		}
		int id1 = 8;
		String name1 = "Trang";
		int age1 = 25;
		double salary1 = 10000;
		
		System.out.println("--------INSERT------------");
		/*String sql2 = "Insert into customers (ID, NAME, AGE, SALARY) "
	              + " values (8, 'Minh', 22, 10000) ";*/
		String sql2 = "Insert into customers (ID, NAME, AGE, SALARY) values ("
				  + id1 + "," + "'" + name1 + "'" + "," + age1 + "," + salary1
	              +  ")";
		 int rowCount = statement.executeUpdate(sql2);
		 System.out.println("Row Count affected = " + rowCount);
		// Đóng kết nối
		connection.close();
	}
}
