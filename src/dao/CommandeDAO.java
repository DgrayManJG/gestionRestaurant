package dao;

import javax.persistence.EntityManager;

import bo.Commande;

public class CommandeDAO implements CRUD {
	
	static StatutDao statutDao;
	private EntityManager em = JPAUtil.getEntityManager();

	@Override
	public int create(Object object) {
		Commande commande = new Commande();
		
		try {	
			commande = (Commande)object;
			em.getTransaction().begin();
			em.persist(commande);
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}

		return commande.getId();
	}

	@Override
	public boolean modify(Object object) {
		Commande commande = new Commande();
		
		try{
			commande = (Commande)object;
			em.getTransaction().begin();
			em.persist(commande);
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

	@Override
	public boolean delete(Object object) {
		Commande commande = new Commande();
		
		try {
			commande = (Commande)object;
			em.getTransaction().begin();
			em.remove(commande);
			em.getTransaction().commit();
			em.close();			
		} catch (Exception e ) {
			System.out.println(e);
			return false;
		}
		return true;
	}

}
