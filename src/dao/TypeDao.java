package dao;

import javax.persistence.EntityManager;

import bo.Place;
import bo.Type;



public class TypeDao implements CRUD {
	
	private EntityManager em = JPAUtil.getEntityManager();
	
	static TypeDao typeDao;
	
	public static TypeDao getInstance()
	{			
		if (typeDao == null){ 	
			typeDao = new TypeDao();	
		}
		return typeDao;
	}

	@Override
	public int create(Object object) {
		
		Type type = new Type();
		
		try {	
			type = (Type)object;
			em.getTransaction().begin();
			em.persist(type);
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
		
		return type.getId();
	}

	@Override
	public boolean modify(Object object) {
		Type type = new Type();
		
		try{
			type = (Type) object;
			em.getTransaction().begin();
			em.persist(type);
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
		Type type = new Type();
		
		try {
			type = (Type)object;
			em.getTransaction().begin();
			em.remove(type);
			em.getTransaction().commit();
			em.close();			
		} catch (Exception e ) {
			System.out.println(e);
			return false;
		}
		return true;
	}

}