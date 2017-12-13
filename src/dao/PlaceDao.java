package dao;

import java.util.Collection;

import javax.persistence.EntityManager;

import bo.Place;
import bo.Plat;

public class PlaceDao implements CRUD {
	
	static PlaceDao placeDao;
	
	public static PlaceDao getInstance()
	{			
		if (placeDao == null){ 	
			placeDao = new PlaceDao();	
		}
		return placeDao;
	}

	@Override
	public boolean modify(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int create(Object object) {
		
		return 0;
	}
	
	public Collection<Place> getAllPlaceWithStatut() {
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		Collection<Place> Places = em.createQuery("SELECT p FROM Place p").getResultList();
		
		for(Place place : Places )  {
			System.out.println(place);
			System.out.println(place.getStatut());
		}
		
		return Places;
	}

}
