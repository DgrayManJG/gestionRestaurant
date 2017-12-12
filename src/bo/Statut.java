package bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Statut {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="libelle", length=10)
	private String libelle;
	
	@OneToMany(mappedBy="statut")
	private Place place;

	
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

	public Place getTable() {
		return place;
	}

	public void setTable(Place table) {
		this.place = table;
	}

	@Override
	public String toString() {
		return "Statut [id=" + id + ", libelle=" + libelle + ", table=" + place + "]";
	}
	
}
