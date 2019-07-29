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
				user.setAvatar(rs.getString("avatar"));
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

	@Override
	public User findUserById(int id) {
		List<User> userList = new ArrayList<User>();
		String sql = "SELECT * FROM User WHERE "
				+ "id = " + id;
		System.out.print("sql");
		Connection conn;
		try {
			conn = super.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User userOut = new User();
				userOut.setId(rs.getInt("id"));
				userOut.setUsername(rs.getString("username"));
				userOut.setPassword(rs.getString("password"));
				userOut.setEmail(rs.getString("email"));
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

	@Override
	public void editUser(User user) {
		String sql = "UPDATE User SET "
				+ "email = '" + user.getEmail() + "' WHERE id = " + user.getId();
		System.out.print("sql");
		Connection conn;
		try {
			conn = super.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.executeUpdate();

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void deleteUser(int id) {
		String sql = "DELETE From User WHERE id = " + id;
		Connection conn;
		try {
			conn = super.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.executeUpdate();

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void addUser(User user) {
		String sql = "INSERT INTO User(avatar, username, password, email) VALUES("
				+ "'" + user.getAvatar() + "',"
				+ "'" + user.getUsername() + "',"
				+ "'" + user.getPassword() + "',"
				+ "'" + user.getEmail() + "')";
		Connection conn;
		try {
			conn = super.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.executeUpdate();

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}
