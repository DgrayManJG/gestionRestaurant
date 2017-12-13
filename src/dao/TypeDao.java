package dao;

<<<<<<< HEAD
import bo.Type;
=======
import Dao.InscriptionDAO;
>>>>>>> ab25ae06e469be2e41d4e4764cae014027ea3972

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