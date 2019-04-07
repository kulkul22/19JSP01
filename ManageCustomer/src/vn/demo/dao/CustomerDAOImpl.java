/**
 * 
 */
package vn.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vn.demo.bo.Customer;
import vn.demo.idao.ICustomerDAO;

/**
 * @author TechCare
 *
 */
public class CustomerDAOImpl implements ICustomerDAO {

	@Override
	public void addCustomer(Customer customer, Statement statement) throws SQLException {
		System.out.println("--------INSERT------------");
		String sql = "Insert into customers (ID, NAME, AGE, SALARY) values ("
				  + customer.getId() + "," + "'" + customer.getName() + "'" + "," + customer.getAge() + "," + customer.getSalary()
	              +  ")";
		 int rowCount = statement.executeUpdate(sql);
		 System.out.println("Sql insert : " + sql);
		 System.out.println("Row Count affected = " + rowCount);
		
	}

	@Override
	public List<Customer> getCustomer(Statement statement) throws SQLException {
		List<Customer> customers = new ArrayList<Customer>();
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
			Customer customer = new Customer(id, name, age, salary);
			customers.add(customer);
		}
		return customers;
		
	}

	@Override
	public void updateCustomerByName(String name, Statement statement) throws SQLException {
		System.out.println("--------UPDATE------------");
		String sql = "UPDATE customers SET salary = 3000 WHERE name = '" + name + "'";
		System.out.println("Sql update : " + sql);
		statement.executeUpdate(sql);
		
	}

	@Override
	public void deleteCustomerByName(String name, Statement statement) throws SQLException {
		System.out.println("--------DELETE------------");
		String sql = "DELETE FROM customers WHERE name = '" +  name + "'";
		statement.executeUpdate(sql);
		System.out.println("Sql delete : " + sql);
	}

	@Override
	public List<Customer> findCustomerByName(String nameSearch, Statement statement) throws SQLException {
		List<Customer> customers = new ArrayList<Customer>();
		String sql = "Select ID, NAME, AGE, SALARY from customers where NAME = '" + nameSearch + "'";

		// Thực thi câu lệnh SQL trả về đối tượng ResultSet.
		ResultSet rs = statement.executeQuery(sql);

		// Duyệt trên kết quả trả về.
		while (rs.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
			int id = rs.getInt(1);
			String name = rs.getString("NAME");
			int age = rs.getInt(3);
			double salary = rs.getDouble(4);
			Customer customer = new Customer(id, name, age, salary);
			customers.add(customer);
		}
		return customers;
	}
	
}
