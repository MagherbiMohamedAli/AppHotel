package tn.essat.dao;

import java.util.List;

import tn.essat.model.Client;

public interface IClient {
	public List<Client> getAllClients();
	public void addClient(Client clt);
	public void deleteClient(int id);
	public Client getClientById(int id);

}
