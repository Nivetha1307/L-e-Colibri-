package net.codejava.servlet;
import java.io.IOException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet implementation class guru_register
 */
@WebServlet("/catering_register")
public class catering_register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String first_name = request.getParameter("first-name");
		String last_name = request.getParameter("last-name");
		String username = request.getParameter("phone-number");
		String password = request.getParameter("email");
		String address = request.getParameter("order");
		String contact = request.getParameter("guests");
                String date = request.getParameter("date");
                String month = request.getParameter("month");
                String year = request.getParameter("year");
		String hour = request.getParameter("hour");
                String minute = request.getParameter("minute");
                String am-pm = request.getParameter("am-pm");
                String pickup-delivery = request.getParameter("pickup-delivery");
                 String address-1 = request.getParameter("address-1");
                String city = request.getParameter("city");
                String state = request.getParameter("state");
                String zipcode = request.getParameter("zipcode");
                String country = request.getParameter("country");

		if(first_name.isEmpty() || last_name.isEmpty() || username.isEmpty() || 
				password.isEmpty() || address.isEmpty() || contact.isEmpty() || date.isEmpty() || month.isEmpty() || year.isEmpty() ||
                            hour.isEmpty() || minute.isEmpty() || am-pm.isEmpty() ||pickup-delivery.isEmpty() ||address-1.isEmpty() ||city.isEmpty() ||
                            state.isEmpty() || zipcode.isEmpty() || country.isEmpty())
		{
			RequestDispatcher req = request.getRequestDispatcher("catered-services.jsp");
			req.include(request, response);
		}
		else
		{
			RequestDispatcher req = request.getRequestDispatcher("register_2.jsp");
			req.forward(request, response);
		}
	}
 
}