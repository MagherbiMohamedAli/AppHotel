package tn.essat.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import tn.essat.model.Chambre;
import tn.essat.model.Reservation;

public class ReservationImp implements IReservation {

	Connection cnx;
	
	
	public ReservationImp() {
		try {			
			Class.forName("com.mysql.jdbc.Driver");
			this.cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/basehotel","root","");
			System.out.println("Cnx etablie");
		}catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}


	@Override
	public List<Reservation> getAllReservation() {
		IClient daoc= new ClientImp();
		IChambre daoch= new ChambreImp();
		List<Reservation> liste=null;
		try {
			liste= new ArrayList<Reservation>();
			PreparedStatement pre=this.cnx.prepareStatement("select * from reservation");
		    ResultSet rs=pre.executeQuery();
		    while(rs.next()) {
		    	Reservation r= new Reservation();
		    	r.setId(rs.getInt("id"));
		    	r.setCh(daoch.getChambreById( rs.getInt("id_ch") ));
		    	r.setClt(daoc.getClientById(rs.getInt("id_clt")));
		    	r.setDate_end(rs.getString("date_end"));
		    	r.setDate_start(rs.getString("date_start"));
		    	liste.add(r);
		    }
		    
		}catch (Exception e) {
			// TODO: handle exception
		}	
		
		return liste;		
	}


	@Override
	public void addReservation(Reservation r) {
		try {
			
			PreparedStatement pre= this.cnx.prepareStatement("insert into reservation values(null,?,?,?,?)");
			pre.setInt(1,r.getClt().getId());
			pre.setInt(2,r.getCh().getId());
			pre.setString(3,r.getDate_start());
			pre.setString(4,r.getDate_end());
			pre.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}


	@Override
	public void deleteReservaion(int id) {
		try {
			
			PreparedStatement pre= this.cnx.prepareStatement("delete from reservation where id=?");
			pre.setInt(1,id);			
			pre.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
