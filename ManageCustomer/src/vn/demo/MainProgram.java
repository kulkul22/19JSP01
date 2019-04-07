/**
 * 
 */
package vn.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import vn.demo.bo.Customer;
import vn.demo.dao.CustomerDAOImpl;
import vn.demo.idao.ICustomerDAO;
import vn.demo.utils.ConnectionUtils;

/**
 * @author TechCare
 *
 */
public class MainProgram {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Connect to DB
		Connection connection = ConnectionUtils.getMyConnection();
		Statement statement = connection.createStatement();
		
		// ADD Customer
		ICustomerDAO customerDAO = new CustomerDAOImpl();
		Customer customer = new Customer(13, "Minh", 24, (double) 8000);
		if (customerDAO.findCustomerByName(customer.getName(), statement) == null ||
				customerDAO.findCustomerByName(customer.getName(), statement).size() == 0) {
			customerDAO.addCustomer(customer, statement);
		}
		
		// Get All customer
		List<Customer> customers = customerDAO.getCustomer(statement);
		System.out.println("-----------------CUSTOMERS--------------------");
		for (Customer customerElement : customers) {
			System.out.println(customerElement.getId() + " " + customerElement.getName() + " " + customerElement.getAge() + " " + customerElement.getSalary());
			
		}
		
		// Update Customer and set salary = 3000 by name
		customerDAO.updateCustomerByName("Timo", statement);
		
		// Delete customer with name
		customerDAO.deleteCustomerByName("Alex", statement);
		
		connection.close();
	}

}
