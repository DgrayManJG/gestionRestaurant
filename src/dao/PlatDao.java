package dao;

import javax.persistence.EntityManager;

import bo.Plat;

public class PlatDao implements CRUD {
	
	static PlatDao platDao;
	private EntityManager em = JPAUtil.getEntityManager();
	
	public static PlatDao getInstance(){			
		if (platDao == null){ 	
			platDao = new PlatDao();	
		}
		return platDao;
	}
	
	@Override
	public int create(Object object) {
		Plat plat = new Plat();
		
		try {	
			plat = (Plat)object;
			em.getTransaction().begin();
			em.persist(plat);
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
		
		return plat.getId();
	}

	@Override
	public boolean modify(Object object) {
		Plat plat = new Plat();
		
		try{
			plat = (Plat) object;
			em.getTransaction().begin();
			em.persist(plat);
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
		Plat plat = new Plat();
		
		try {
			plat = (Plat)object;
			em.getTransaction().begin();
			em.remove(plat);
			em.getTransaction().commit();
			em.close();			
		} catch (Exception e ) {
			System.out.println(e);
			return false;
		}
		return true;
	}
}
