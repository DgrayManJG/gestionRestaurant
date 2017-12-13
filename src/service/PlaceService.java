package service;

import java.util.Collection;

import bo.Place;
import dao.PlaceDao;

public class PlaceService {
	
	public Collection<Place> getTables()
	{
		PlaceDao placeDao = PlaceDao.getInstance();
		Collection<Place> place = placeDao.getAllPlaceWithStatut();
		
		return place;
	}

}
