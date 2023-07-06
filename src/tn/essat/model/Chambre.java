package tn.essat.model;

public class Chambre {
	private int id;
	private String titre;
	private String type;
	private float prix;
	public Chambre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Chambre(int id, String titre, String type, float prix) {
		super();
		this.id = id;
		this.titre = titre;
		this.type = type;
		this.prix = prix;
	}
	public Chambre(String titre, String type, float prix) {
		super();
		
		this.titre = titre;
		this.type = type;
		this.prix = prix;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
}
