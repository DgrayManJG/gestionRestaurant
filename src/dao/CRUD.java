package dao;

public interface CRUD {
	
	/**
	 * Permet l'ajout, des objetc en base. Doit retourner l'id ajout�
	 * @param object
	 * @return
	 */
	public int create(Object object);
	
	/**
	 * Permet la modification d'un objet. True si modifi� avec succ�s
	 * @param object
	 * @return
	 */
	public boolean modify(Object object);
	
	/**
	 * Permet la suppression d'un object. True si supprim�
	 * @param object
	 * @return
	 */
	public boolean delete(Object object);
}
