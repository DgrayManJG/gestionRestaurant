package bo;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Type {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="libelle", length=40)
	private String libelle;
	
	@OneToMany(mappedBy="type")
	private Collection<Plat> plat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Collection<Plat> getPlat() {
		return plat;
	}

	public void setPlat(Collection<Plat> plat) {
		this.plat = plat;
	}

	@Override
	public String toString() {
		return "Type [id=" + id + ", libelle=" + libelle + ", plat=" + plat + "]";
	}

}
