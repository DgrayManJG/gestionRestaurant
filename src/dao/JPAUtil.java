package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.SessionFactory;

public class JPAUtil {
	
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionRestaurant");
	
	public static EntityManager getEntityManager()
	{
		return emf.createEntityManager();
	}
	public static CriteriaBuilder getCriteriaBuilder()
	{
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("gestionRestaurant");
		return emf.getCriteriaBuilder();
	}
}
