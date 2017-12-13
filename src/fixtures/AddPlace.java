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
		Place place = new Place();
		place.setNumber(1);
		place.setDecription("au milieu");
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		Statut statut = em.find(Statut.class, 1);
		System.out.println(statut);
		place.setStatut(statut);
		
		em.persist(place);
		em.getTransaction().commit();
		
		PlaceDao placeDao = new PlaceDao(); 
		placeDao.getAllPlaceWithStatut();
		
		em.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
