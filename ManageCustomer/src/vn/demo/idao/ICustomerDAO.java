/**
 * 
 */
package vn.demo.idao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import vn.demo.bo.Customer;

/**
 * @author TechCare
 *
 */
public interface ICustomerDAO {
	public void addCustomer(Customer customer, Statement statement) throws SQLException;
	public List<Customer> getCustomer(Statement statement) throws SQLException;
	public void updateCustomerByName(String name, Statement statement) throws SQLException;
	public void deleteCustomerByName(String name, Statement statement) throws SQLException;
	public List<Customer> findCustomerByName(String name, Statement statement) throws SQLException;
}
