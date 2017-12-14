package fixtures;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.Plat;
import bo.Type;
import dao.JPAUtil;
import dao.TypeDao;

@WebServlet("/AddPlat")
public class AddPlat extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		TypeDao typeDao = new TypeDao(); 
		
		Type type1 = new Type();
		type1.setLibelle("Plat");
		System.out.println(typeDao.create(type1));
		
		//em.persist(type1);
		Type type2 = new Type();
		type2.setLibelle("Dessert");
		em.persist(type2);
		Type type3 = new Type();
		type3.setLibelle("Délice inconu");
		em.persist(type3);
		
		Plat plat = new Plat();
		plat.setLibelle("Bétrave sauce papaille");
		plat.setPrix(6.0);
		plat.setType(type3);
		em.persist(plat);
		
		Plat plat2 = new Plat();
		plat2.setLibelle("Gauffre chocolat chaud chantilly");
		plat2.setPrix(29.0);
		plat2.setType(type2);
		em.persist(plat2);
		
		Plat plat3 = new Plat();
		plat3.setLibelle("Glace 3 grosses boules");
		plat3.setPrix(10.0);
		plat3.setType(type2);
		em.persist(plat3);
		
		Plat plat4 = new Plat();
		plat4.setLibelle("Chantilly");
		plat4.setPrix(10.0);
		plat4.setType(type2);
		em.persist(plat4);
		
		Plat plat5 = new Plat();
		plat5.setLibelle("Bout de viande ++");
		plat5.setPrix(15.0);
		plat5.setType(type1);
		em.persist(plat5);
		
		Plat plat6 = new Plat();
		plat6.setLibelle("Bout de dinde");
		plat6.setPrix(15.0);
		plat6.setType(type1);
		em.persist(plat6);
		
		Plat plat7 = new Plat();
		plat7.setLibelle("Haricot vert mayo");
		plat7.setPrix(35.0);
		plat7.setType(type1);
		em.persist(plat7);
		
		Plat plat8 = new Plat();
		plat8.setLibelle("Cervelet de Nael");
		plat8.setPrix(0.50);
		plat8.setType(type1);
		em.persist(plat8);
		
		Plat plat9 = new Plat();
		plat9.setLibelle("Cerveau de Jimmy");
		plat9.setPrix(0.10);
		plat9.setType(type1);
		em.persist(plat9);
		
		em.getTransaction().commit();
		
		em.close();
		
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
