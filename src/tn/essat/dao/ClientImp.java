package tn.essat.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import tn.essat.model.Chambre;
import tn.essat.model.Client;

public class ClientImp implements IClient {
	Connection cnx;
	
	
	public ClientImp() {
		try {			
			Class.forName("com.mysql.jdbc.Driver");
			this.cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/basehotel","root","");
			System.out.println("Cnx etablie");
		}catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	@Override
	public List<Client> getAllClients() {
		List<Client> liste=null;
		try {
			liste= new ArrayList<Client>();
			PreparedStatement pre=this.cnx.prepareStatement("select * from client");
		    ResultSet rs=pre.executeQuery();
		    while(rs.next()) {
		    	Client cl= new Client();
		    	cl.setId(rs.getInt("id"));
		    	cl.setFirstname(rs.getString("firstname"));
		    	cl.setLastname(rs.getString("lastname"));
		    	liste.add(cl);
		    }
		    
		}catch (Exception e) {
			// TODO: handle exception
		}	
		
		return liste;
	}

	@Override
	public void addClient(Client clt) {
		try {
			PreparedStatement pre=this.cnx.prepareStatement("insert into client values(null,?,?)");
			pre.setString(1, clt.getFirstname());
			pre.setString(2, clt.getLastname());
			pre.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void deleteClient(int id) {
		try {
			
			PreparedStatement pre= this.cnx.prepareStatement("delete from client where id=?");
			pre.setInt(1,id);			
			pre.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public Client getClientById(int id) {
		Client clt=null;
		
		try {
			clt=new Client();
			PreparedStatement pre=this.cnx.prepareStatement("select * from client where id=?");
			pre.setInt(1, id);
		    ResultSet rs=pre.executeQuery();
		    while(rs.next()) {		    	
		    	clt.setId(rs.getInt("id"));
		    	clt.setFirstname(rs.getString("firstname"));
		    	clt.setLastname(rs.getString("lastname"));		    
		    }
		    
		}catch (Exception e) {
			// TODO: handle exception
		}	
		
		return clt;
	}

}
