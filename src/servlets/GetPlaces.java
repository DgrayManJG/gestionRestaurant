package servlets;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.Place;
import service.PlaceService;

/**
 * Servlet implementation class GetTables
 */
@WebServlet("/places")
public class GetPlaces extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PlaceService placeService = new PlaceService();
		Collection<Place> places = placeService.getTables();
		
		request.setAttribute("places", places);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/places.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
