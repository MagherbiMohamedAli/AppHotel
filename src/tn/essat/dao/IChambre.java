package tn.essat.dao;

import java.util.List;

import tn.essat.model.Chambre;

public interface IChambre {
	public List<Chambre> getAllChambres();
	public void addChambre(Chambre ch);
	public void deleteChambre(int id);
	public Chambre getChambreById(int id);
	

}
