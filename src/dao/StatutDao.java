package dao;

import javax.persistence.EntityManager;

import bo.Statut;

public class StatutDao implements CRUD {
	
	static StatutDao statutDao;
	private EntityManager em = JPAUtil.getEntityManager();
	
	@Override
	public int create(Object object) {
		Statut statut = new Statut();
		
		try {	
			statut = (Statut)object;
			em.getTransaction().begin();
			em.persist(statut);
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
		
		return statut.getId();
	}

	@Override
	public boolean modify(Object object) {
		Statut statut = new Statut();
		
		try{
			statut = (Statut)object;
			em.getTransaction().begin();
			em.persist(statut);
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
		Statut statut = new Statut();
		
		try {
			statut = (Statut)object;
			em.getTransaction().begin();
			em.remove(statut);
			em.getTransaction().commit();
			em.close();			
		} catch (Exception e ) {
			System.out.println(e);
			return false;
		}
		return true;
	}

}
