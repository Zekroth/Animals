package Astratti;

public abstract class Animali {
	public abstract boolean comeMangiano(); //Come si alimentano gli animali
	public abstract boolean comeSiSpostano(); //Come si muovono o come vengono mossi
	public abstract boolean comeAssumonoOssigeno();	//Come assumono ossigeno
	public abstract boolean comeSiRiproducono(); //Come si riproducono
	protected String habitat; //Qual è il loro habitat naturale
	protected boolean cattivita; //Possono vivere in cattività? true = si | false = no
	protected boolean specieProtetta; //E' una specie protetta? true = si | false = no
	protected boolean haUnSesso; //Ha un sesso? true = si | false = no
	private String descrizione; //Descrizione animale
	private Double peso;
	private String dieta;
	private Double lunghezza;
	private Double altezza;
	private Double larghezza;
	
	
	public String getHabitat() {
		return habitat;
	}
	public boolean isCattivita() {
		return cattivita;
	}
	public boolean isSpecieProtetta() {
		return specieProtetta;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public void setCattivita(boolean cattivita) {
		this.cattivita = cattivita;
	}
	public void setSpecieProtetta(boolean specieProtetta) {
		this.specieProtetta = specieProtetta;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getDieta() {
		return dieta;
	}
	public void setDieta(String dieta) {
		this.dieta = dieta;
	}
	public Double getLunghezza() {
		return lunghezza;
	}
	public void setLunghezza(Double lunghezza) {
		this.lunghezza = lunghezza;
	}
	public Double getAltezza() {
		return altezza;
	}
	public void setAltezza(Double altezza) {
		this.altezza = altezza;
	}
	public Double getLarghezza() {
		return larghezza;
	}
	public void setLarghezza(Double larghezza) {
		this.larghezza = larghezza;
	}
}
