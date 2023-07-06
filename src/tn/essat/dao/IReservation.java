package tn.essat.dao;

import java.util.List;

import tn.essat.model.Reservation;

public interface IReservation {
	public List<Reservation> getAllReservation();
	public void addReservation(Reservation r);
	public void deleteReservaion(int id);
	
	
}
