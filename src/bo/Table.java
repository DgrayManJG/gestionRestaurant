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
	
}
