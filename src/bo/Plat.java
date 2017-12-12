package bo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Plat {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="libelle", length=80)
	private String libelle;
	
	@Column(name="prix")
	private Double prix;
	
	@OneToMany
	private Type type;

}
