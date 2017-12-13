package fixtures;

import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.Commande;
import bo.Place;
import bo.Reservation;
import bo.Service;
import dao.JPAUtil;

/**
 * Servlet implementation class AddService
 */
@WebServlet("/AddService")
public class AddService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		Service service = new Service();
		
		Place place = em.find(Place.class, 1);
		System.out.println(place);
		service.setPlace(place);
		
		Commande commande = em.find(Commande.class, 1);
		System.out.println(commande);
		service.setCommande(commande);
		
		em.persist(service);
		em.getTransaction().commit();
		em.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
