package bo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity 
public class Commande {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToMany
	private Collection<Plat> plat;
	
	@OneToMany(mappedBy="commande")
	private Collection<Service> service;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Collection<Plat> getPlat() {
		return plat;
	}

	public void setPlat(Collection<Plat> plat) {
		this.plat = plat;
	}
	
	public Collection<Service> getService() {
		return service;
	}

	public void setService(Collection<Service> service) {
		this.service = service;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", plat=" + plat + "]";
	}
	
}
