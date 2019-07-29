/**
 * 
 */
package jsp.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import jsp.demo.dao.UserDAO;
import jsp.demo.dao.impl.UserDAOImpl;
import jsp.demo.model.User;
import jsp.demo.service.UserService;

/**
 * @author TechCare
 *
 */
public class UserServiceImpl implements UserService {
	UserDAO userDAO = new UserDAOImpl();
	
	@Override
	public boolean checkLogin(User user) {
		if ("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean checkAdmin(int role) {
		if (role == 1) {
			return true;
		}
		return false;
	}

	@Override
	public List<User> getAll() {
		List<User> users = new ArrayList<User>();
		users = userDAO.getAll();
		return users;
	}

	@Override
	public User findUserByNameAndPass(String userName, String password) {
		User userOut = userDAO.findUserByNameAndPass(userName, password);
		return userOut;
	}

	@Override
	public User findUserById(int id) {
		User userOut = userDAO.findUserById(id);
		return userOut;
	}

	@Override
	public void editUser(User user) {
		userDAO.editUser(user);
	}

	@Override
	public void deleteUser(int id) {
		userDAO.deleteUser(id);
	}

	@Override
	public void addUser(User user) {
		userDAO.addUser(user);
	}
}
