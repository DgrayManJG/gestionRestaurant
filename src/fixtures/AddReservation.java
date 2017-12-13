package fixtures;

import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.Place;
import bo.Reservation;
import dao.JPAUtil;

/**
 * Servlet implementation class AddReservation
 */
@WebServlet("/AddReservation")
public class AddReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date aujourdhui = new Date();
		
		Reservation reservation = new Reservation();
		reservation.setNom("Mr holme");
		reservation.setDate(aujourdhui);
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		Place place = em.find(Place.class, 1);
		System.out.println(place);
		reservation.setPlace(place);
		
		em.persist(reservation);
		em.getTransaction().commit();
		em.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
