package dao;

import javax.persistence.EntityManager;

import bo.Plat;
import bo.Service;

public class ServiceDao implements CRUD {
	
	static ServiceDao serviceDao;
	private EntityManager em = JPAUtil.getEntityManager();
	
	public static ServiceDao getInstance(){			
		if (serviceDao == null){ 	
			serviceDao = new ServiceDao();	
		}
		return serviceDao;
	}

	@Override
	public int create(Object object) {
		Service service = new Service();
		
		try {	
			service = (Service)object;
			em.getTransaction().begin();
			em.persist(service);
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
		
		return service.getId();
	}

	@Override
	public boolean modify(Object object) {
		Service service = new Service();
		
		try{
			service = (Service)object;
			em.getTransaction().begin();
			em.persist(service);
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
		Service service = new Service();
		
		try {
			service = (Service)object;
			em.getTransaction().begin();
			em.remove(service);
			em.getTransaction().commit();
			em.close();			
		} catch (Exception e ) {
			System.out.println(e);
			return false;
		}
		return true;
	}
}
