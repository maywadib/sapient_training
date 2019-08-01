package training.sapient.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	//http://localhost:8080/SpringMVC/login
	//method 1 to call loginpage.jsp
	
	
	@RequestMapping("/login")
	public String getloginPage() {
		return "LoginPage";
	}
	
	//method 2 to do validation
	
	@RequestMapping(value = "/loginvalidate",method = RequestMethod.GET)
	public ModelAndView loginValidate(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String password = request.getParameter("pass");
		
		//we can connect to db
		
		
		if(name.equals("sapient") && password.equals("india")) {
			String msg = "Hello " + name;
			return new ModelAndView("loginsuccesspage", "succcessmessage", msg);
		}
		
		return new ModelAndView("loginfailurepage", "message", "sorry invalid credentials");
	}
	
}
