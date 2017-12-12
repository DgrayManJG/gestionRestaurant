package bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity 
public class Table {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id	;
	
	@Column(name="number", length=4)
	private int number	;
	
	@Column(name="description", length=150)
	private String decription	;
	
	@ManyToOne
	private Statut statut;
	
	@OneToMany(mappedBy="table")
	private Service service;
	
	@ManyToOne
	private Reservation reservation;
	
	public Table() {
		
	}

	public Table(int id, int number, String decription, Statut statut, Service service, Reservation reservation) {
		super();
		this.id = id;
		this.number = number;
		this.decription = decription;
		this.statut = statut;
		this.service = service;
		this.reservation = reservation;
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

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}	
}
