package bo;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity 
public class Place {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id	;
	
	@Column(name="number", length=4)
	private int number;
	
	@Column(name="description", length=150)
	private String decription;
	
	@ManyToOne
	private Statut statut;
	
	@OneToMany(mappedBy="place")
	private Collection<Service> service;
	
	@OneToMany(mappedBy="place")
	private Collection<Reservation> reservation;
	
	public Place() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public Collection<Service> getService() {
		return service;
	}

	public void setService(Collection<Service> service) {
		this.service = service;
	}
	
	public Collection<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(Collection<Reservation> reservation) {
		this.reservation = reservation;
	}


	@Override
	public String toString() {
		return "Place [id=" + id + ", number=" + number + ", decription=" + decription + "]";
	}
	
}
