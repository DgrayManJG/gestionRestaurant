package dao;

public interface CRUD {
	
	/**
	 * Permet l'ajout, des objetc en base. Doit retourner l'id ajouté
	 * @param object
	 * @return
	 */
	public int create(Object object);
	
	/**
	 * Permet la modification d'un objet. True si modifié avec succès
	 * @param object
	 * @return
	 */
	public boolean modify(Object object);
	
	/**
	 * Permet la suppression d'un object. True si supprimé
	 * @param object
	 * @return
	 */
	public boolean delete(Object object);
}
