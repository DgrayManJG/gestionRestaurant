package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Validator;

/**
 * Servlet implementation class Reservation
 */
@WebServlet("/place/reservation")
public class Reservation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("idPlace", request.getParameter("idPlace"));
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/reservation.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Validator validator = new Validator();
		
		validator.formReservation(request);
		
		
	}

}
