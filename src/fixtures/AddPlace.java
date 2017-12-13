package fixtures;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.Place;
import bo.Statut;
import dao.JPAUtil;
import dao.PlaceDao;

/**
 * Servlet implementation class AddPlace
 */
@WebServlet("/AddPlace")
public class AddPlace extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		Statut statut = em.find(Statut.class, 1);
		
		Place place = new Place();
		place.setNumber(1);
		place.setDecription("au milieu");
		place.setStatut(statut);
		em.persist(place);
		
		Place place1 = new Place();
		place1.setNumber(2);
		place1.setDecription("fenêtre droite");
		place1.setStatut(statut);
		em.persist(place1);
		
		Place place2 = new Place();
		place2.setNumber(3);
		place2.setDecription("fenêtre gauche");
		place2.setStatut(statut);
		em.persist(place2);
		
		Place place3 = new Place();
		place3.setNumber(4);
		place3.setDecription("devant la porte");
		place3.setStatut(statut);
		em.persist(place3);
		
		em.getTransaction().commit();
		
		em.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
