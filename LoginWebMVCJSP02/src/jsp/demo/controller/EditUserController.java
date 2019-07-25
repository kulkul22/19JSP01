package jsp.demo.controller;

import java.io.IOException;

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
 * Servlet implementation class EditUserController
 */
@WebServlet("/editUser")
public class EditUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/view/editUser.jsp");
		
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("id: ----->" + id);
		UserService userService = new UserServiceImpl();
		User user = userService.findUserById(id);
		request.setAttribute("user", user);
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String email = request.getParameter("email");
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		UserService userService = new UserServiceImpl();
		userService.editUser(user);
		response.sendRedirect("admin");
	}

}
