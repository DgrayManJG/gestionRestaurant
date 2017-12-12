package bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Statut {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="libelle", length=10)
	private String libelle;
	
}
