/**
 * 
 */
package jsp.demo.service;

import java.util.List;

import jsp.demo.model.User;

/**
 * @author TechCare
 *
 */
public interface UserService {
	public boolean checkLogin(User user);
	public boolean checkAdmin(int role);
	public List<User> getAll();
	public User findUserByNameAndPass(String userName, String password);
	public User findUserById(int id);
	public void editUser(User user);
	public void deleteUser(int id);
	public void addUser(User user);
}
