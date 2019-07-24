package training.servlets.basics;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import training.servlets.beans.LoginBean;
import training.servlets.service.UserBL;

@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	UserBL userBl;
	public void init() {
		userBl = new UserBL();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String userName = request.getParameter("uname");
	String password = request.getParameter("pwd");
	
	LoginBean loginBean = new LoginBean(userName, password);
	
	
	if(userBl.validateUser(loginBean)) {
	
		RequestDispatcher rd = request.getRequestDispatcher("Success");
		
		rd.forward(request, response);
		
		//no statements
	}
	else {

		RequestDispatcher rd = request.getRequestDispatcher("Failure");
		rd.include(request,response);
		RequestDispatcher rd1 = request.getRequestDispatcher("/Login.html");
		rd1.include(request, response);
		
//		rd.forward(request, response);

		System.out.println("you are here because of invalid codeeee");
	}
	
	//invoke buisness logic
	
	}

}
