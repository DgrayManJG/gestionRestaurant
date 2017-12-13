package fixtures;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.Commande;
import bo.Plat;
import dao.JPAUtil;

/**
 * Servlet implementation class AddCommande
 */
@WebServlet("/AddCommande")
public class AddCommande extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date aujourdhui = new Date();
		
		Commande commande = new Commande();
		commande.setDate(aujourdhui);
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		Collection<Plat> plat = em.createQuery("SELECT p FROM Plat p").getResultList();
		System.out.println(plat);
		commande.setPlat(plat);
		
		em.persist(commande);
		em.getTransaction().commit();
		em.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
