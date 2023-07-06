package tn.essat.model;

public class Reservation {
	private int id;
	private Client clt;
	private Chambre ch;
	private String date_start;
	private String date_end;
	public Reservation(int id, Client clt, Chambre ch, String date_start, String date_end) {
		super();
		this.id = id;
		this.clt = clt;
		this.ch = ch;
		this.date_start = date_start;
		this.date_end = date_end;
	}
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Client getClt() {
		return clt;
	}
	public void setClt(Client clt) {
		this.clt = clt;
	}
	public Chambre getCh() {
		return ch;
	}
	public void setCh(Chambre ch) {
		this.ch = ch;
	}
	public String getDate_start() {
		return date_start;
	}
	public void setDate_start(String date_start) {
		this.date_start = date_start;
	}
	public String getDate_end() {
		return date_end;
	}
	public void setDate_end(String date_end) {
		this.date_end = date_end;
	}
	
	

}
