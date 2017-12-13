package dao;

import Dao.InscriptionDAO;

public class TypeDao implements CRUD{
	
	static TypeDao typeDao;
	
	public static TypeDao getInstance()
	{			
		if (typeDao == null)
		{ 	
			typeDao = new TypeDao();	
		}
		return typeDao;
	}

	@Override
	public int create(Object object) {
		// TODO Auto-generated method stub
		return 0;
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

}