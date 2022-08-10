package cookieExample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class CookieLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	doPost(req, resp);
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			Cookie cookie=new Cookie("username","");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
			
			request.getRequestDispatcher("link.html").forward(request, response);
			
	
	}

}