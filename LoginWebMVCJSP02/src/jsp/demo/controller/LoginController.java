/**
 * 
 */
package jsp.demo.controller;

/**
 * @author TechCare
 *
 */
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp.demo.model.User;
import jsp.demo.service.UserService;
import jsp.demo.service.impl.UserServiceImpl;
 
 
/**
 * LoginController
 * Servlet xử lý đăng nhập và điều hướng
 *
 */
@WebServlet({ "/", "/login" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/view/login.jsp");
		rd.forward(request, response);
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserService service = new UserServiceImpl();
		List<User> users = service.getAll();
		System.out.println("-------->" + users.size());
		User user = service.findUserByNameAndPass(username, password);
		request.getSession().setAttribute("userBean", user);
		if (user != null && user.getUsername() != null) {
			if (service.checkAdmin(user.getRole())) {
				response.sendRedirect("admin");
			} else {
				response.sendRedirect("index");
			}
		} else {
			response.sendRedirect("login?err=1");
		}
		
	}
 
}
