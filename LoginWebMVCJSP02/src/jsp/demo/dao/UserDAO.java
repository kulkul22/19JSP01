/**
 * 
 */
package jsp.demo.dao;

import java.util.List;

import jsp.demo.model.User;

/**
 * @author TechCare
 *
 */
public interface UserDAO {
	public List<User> getAll();
	public User findUserByNameAndPass(String userName, String password);
}
