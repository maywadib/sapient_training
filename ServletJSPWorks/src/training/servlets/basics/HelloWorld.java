package training.servlets.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloWorld() {
        super();
        
        System.out.println("Hello world , in constructor");
    }
    
    
    public void init() {
    	System.out.println("Hi I am in Init, hello world");
    }

    
    
    public void destroy() {
    	System.out.println("hi i am from destroy");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	
	
	//send html content
	
	out.print("<html>");
	out.print("<head><title>Hello world in servlet </title></head>");
	out.print("<body><h1>Welcome to servlets in sapient</h1></body>");
	out.print("</html>");
	
	}

}
