package tn.essat.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import tn.essat.model.Chambre;
import tn.essat.model.Client;


public class ChambreImp implements IChambre {
	
	Connection cnx;
	
	
	public ChambreImp() {
		try {			
			Class.forName("com.mysql.jdbc.Driver");
			this.cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/basehotel","root","");
			System.out.println("Cnx etablie");
		}catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	@Override
	public List<Chambre> getAllChambres() {
		List<Chambre> liste=null;
		try {
			liste= new ArrayList<Chambre>();
			PreparedStatement pre=this.cnx.prepareStatement("select * from chambre");
		    ResultSet rs=pre.executeQuery();
		    while(rs.next()) {
		    	Chambre ch= new Chambre();
		    	ch.setId(rs.getInt("id"));
		    	ch.setTitre(rs.getString("titre"));
		    	ch.setPrix(rs.getFloat("prix"));
		    	ch.setType(rs.getString("type"));
		    	liste.add(ch);
		    }
		    
		}catch (Exception e) {
			// TODO: handle exception
		}	
		
		return liste;
	}

	@Override
	public void addChambre(Chambre ch) {
	try {
		PreparedStatement pre= this.cnx.prepareStatement("insert into chambre values(null,?,?,?)");
		pre.setString(1,ch.getTitre());
		pre.setString(2,ch.getType());
		pre.setFloat(3,ch.getPrix());
		pre.executeUpdate();
	}catch(Exception e) {
		
	}
	}

	@Override
	public void deleteChambre(int id) {
		try {
			
			PreparedStatement pre= this.cnx.prepareStatement("delete from chambre where id=?");
			pre.setInt(1,id);			
			pre.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	@Override
	public Chambre getChambreById(int id) {
		
		Chambre ch=null;
			
			try {
				ch=new Chambre();
				PreparedStatement pre=this.cnx.prepareStatement("select * from chambre where id=?");
				pre.setInt(1, id);
			    ResultSet rs=pre.executeQuery();
			    while(rs.next()) {		    	
			    	ch.setId(rs.getInt("id"));
			    	ch.setTitre(rs.getString("titre"));	    
			    	ch.setPrix(rs.getFloat("prix"));
			    	ch.setType(rs.getString("type"));
			    }
			    
			}catch (Exception e) {
				// TODO: handle exception
			}	
			
			return ch;
	}

}
