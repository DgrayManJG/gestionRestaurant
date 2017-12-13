package bo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Commande {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToMany
	private Plat plat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Plat getPlat() {
		return plat;
	}

	public void setPlat(Plat plat) {
		this.plat = plat;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", plat=" + plat + "]";
	}
	
}
