package tn.essat.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import tn.essat.model.Client;
import tn.essat.model.User;

public class UserImp implements IUser {
	
	Connection cnx;		
	public UserImp() {
		try {			
			Class.forName("com.mysql.jdbc.Driver");
			this.cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/basehotel","root","");			
		}catch (Exception e) {		}
	}

	@Override
	public User verifUser(String username, String password) {
		User u=null;		
		try {			
			PreparedStatement pre=this.cnx.prepareStatement("select * from user where username=? and password=?");
			pre.setString(1, username);
			pre.setString(2, password);
		    ResultSet rs=pre.executeQuery();
		    while(rs.next()) {
		    	u= new User();
		    	u.setId(rs.getInt("id"));
		    	u.setUsername(rs.getString("username"));	
		    	u.setPassword(rs.getString("password"));
		    }		    
		}catch (Exception e) {			}		
		return u;
	}

}
