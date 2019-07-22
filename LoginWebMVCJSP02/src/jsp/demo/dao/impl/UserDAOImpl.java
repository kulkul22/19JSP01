/**
 * 
 */
package jsp.demo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jsp.demo.dao.UserDAO;
import jsp.demo.jdbc.ConnectionUtils;
import jsp.demo.model.User;

/**
 * @author TechCare
 *
 */
public class UserDAOImpl extends ConnectionUtils implements UserDAO  {

	@Override
	public List<User> getAll() {
		List<User> userList = new ArrayList<User>();
		String sql = "SELECT * FROM User";
		Connection conn;
		try {
			conn = super.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setRole(rs.getInt("role_id"));

				userList.add(user);
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return userList;
	}

	@Override
	public User findUserByNameAndPass(String userName, String password) {
		List<User> userList = new ArrayList<User>();
		String sql = "SELECT * FROM User WHERE "
				+ "username = '" + userName + "'"
				+ "AND password = '" + password + "'";
		Connection conn;
		try {
			conn = super.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User userOut = new User();
				userOut.setUsername(rs.getString("username"));
				userOut.setPassword(rs.getString("password"));
				userOut.setRole(rs.getInt("role_id"));

				userList.add(userOut);
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (userList != null && !userList.isEmpty()) {
			return userList.get(0);
		}
		return null;
	}
	
}
