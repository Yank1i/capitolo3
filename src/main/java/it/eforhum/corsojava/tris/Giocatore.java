package it.eforhum.corsojava.tris;

public class Giocatore {
	
	private String nome;
	private boolean turno;
	private int vittorie;
	private int perdite;
	private int[] numbContainer;
	
	public Giocatore() {
		
		
	}
	
	
	
	public int[] getNumbContainer() {
		return numbContainer;
	}



	public void setNumbContainer(int[] numbContainer) {
		this.numbContainer = numbContainer;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean getTurno() {
		return turno;
	}
	public void setTurno(boolean turno) {
		this.turno = turno;
	}
	public int getVittorie() {
		return vittorie;
	}
	public void setVittorie(int vittorie) {
		this.vittorie = vittorie;
	}
	public int getPerdite() {
		return perdite;
	}
	public void setPerdite(int perdite) {
		this.perdite = perdite;
	}
	
	
	

}
