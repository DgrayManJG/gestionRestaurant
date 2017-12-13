package servlets;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.Statut;
import dao.JPAUtil;

/**
 * Servlet implementation class AddStatut
 */
@WebServlet("/AddStatut")
public class AddStatut extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Statut statut = new Statut();
		statut.setLibelle("Libre");
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(statut);
		em.getTransaction().commit();
		em.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
