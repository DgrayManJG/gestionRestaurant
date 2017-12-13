package dao;

import bo.Type;



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

		return 0;
	}

	@Override
	public boolean modify(Object object) {
		
		return false;
	}

	@Override
	public boolean delete(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

}