package training.servlets.basics;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;




@WebServlet("/RedirectionRadio")
public class RedirectionRadio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String interest = request.getParameter("interest");
		
		
		if(interest.equals("sports"))
		{
			response.sendRedirect("https://www.indiatoday.in/sports/cricket/story/bcci-indian-cricketers-association-ica-players-body-union-1572753-2019-07-23");
		}else if(interest.equals("Politics")) {
			response.sendRedirect("https://www.theguardian.com/australia-news/live/2019/jul/24/peter-dutton-misses-deadline-to-hand-over-manus-paladin-document-politics-live");
		}else if(interest.equals("Business")) {
			response.sendRedirect("https://www.moneycontrol.com/news/business/");
		}else if(interest.equals("other")) {
			response.sendError(response.SC_NOT_FOUND, "Sorry we do not provide this service now");
		}
		
		
		
	}

}
