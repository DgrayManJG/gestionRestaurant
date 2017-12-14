package dao;

import java.util.Collection;

import javax.persistence.EntityManager;

import bo.Place;

public class PlaceDao implements CRUD {
	
	static PlaceDao placeDao;
	private EntityManager em = JPAUtil.getEntityManager();
	
	public static PlaceDao getInstance()
	{			
		if (placeDao == null){ 	
			placeDao = new PlaceDao();	
		}
		return placeDao;
	}

	@Override
	public boolean modify(Object object) {
		Place place = new Place();
		
		try{
			place = (Place) object;
			em.getTransaction().begin();
			em.persist(place);
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
		Place place = new Place();
		
		try {
			place = (Place)object;
			em.getTransaction().begin();
			em.remove(place);
			em.getTransaction().commit();
			em.close();			
		} catch (Exception e ) {
			System.out.println(e);
			return false;
		}
		return true;
	}

	@Override
	public int create(Object object) {
		Place place = new Place();
		
		try {	
			place = (Place)object;
			em.getTransaction().begin();
			em.persist(place);
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
		
		return place.getId();
	}
	
	public Collection<Place> getAllPlaceWithStatut() {
		
		em.getTransaction().begin();
		
		Collection<Place> Places = em.createQuery("SELECT p FROM Place p").getResultList();
		
		return Places;
	}
	
	public Place getPlaceById(int idPlace) {
		
		em.getTransaction().begin();
		
		Place place = (Place) em.createQuery("select p from Place p where p.id = :idPlace").setParameter(":idPlace", idPlace).getSingleResult();
		
		return place;
	}

}
