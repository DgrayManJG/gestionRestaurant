package dao;

import javax.persistence.EntityManager;

import bo.Reservation;

public class ReservationDao implements CRUD {
	
	static StatutDao statutDao;
	private EntityManager em = JPAUtil.getEntityManager();

	@Override
	public int create(Object object) {
		Reservation reservation = new Reservation();
		
		try {	
			reservation = (Reservation)object;
			em.getTransaction().begin();
			em.persist(reservation);
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
		
		return reservation.getId();
	}

	@Override
	public boolean modify(Object object) {
		Reservation reservation = new Reservation();
		
		try{
			reservation = (Reservation)object;
			em.getTransaction().begin();
			em.persist(reservation);
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

	@Override
	public boolean delete(Object object) {
		Reservation reservation = new Reservation();
		
		try {
			reservation = (Reservation)object;
			em.getTransaction().begin();
			em.remove(reservation);
			em.getTransaction().commit();
			em.close();			
		} catch (Exception e ) {
			System.out.println(e);
			return false;
		}
		return true;
	}
	
}
