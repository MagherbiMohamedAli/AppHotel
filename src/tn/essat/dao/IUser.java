package tn.essat.dao;

import tn.essat.model.User;

public interface IUser {
	
	public User verifUser(String username, String password);

}
