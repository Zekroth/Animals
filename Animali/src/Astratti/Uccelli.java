package Astratti;

public abstract class Uccelli extends Animali {
	private int ali = 2;
	private int zampe = 2;
	private String tipoPiume;
	private String[] coloriPiumaggio;
	private boolean Vola; //l'uccello in questione vola? true = si | false = no
	private boolean Nuota; //l'uccello in questione nuota? true = si | false = no
	private int mesiPerLaSchiusura;
	private int tempoDiGravidanza; //tempo di gravidanza in settimane
	private String dieta;
	
	/*Override*/@Override
	
	public boolean comeMangiano(){
		System.out.println("Con il becco");
		return true;
	}
	//metodi get e set
	
	public int getAli() {
		return ali;
	}
	public String getDieta() {
		return dieta;
	}
	public void setDieta(String dieta) {
		this.dieta = dieta;
	}
	public int getZampe() {
		return zampe;
	}
	public String getTipoPiume() {
		return tipoPiume;
	}
	public String[] getColoriPiumaggio() {
		return coloriPiumaggio;
	}
	public boolean isVola() {
		return Vola;
	}
	public boolean isNuota() {
		return Nuota;
	}
	public int getMesiPerLaSchiusura() {
		return mesiPerLaSchiusura;
	}
	public int getTempoDiGravidanza() {
		return tempoDiGravidanza;
	}
	public void setAli(int ali) {
		this.ali = ali;
	}
	public void setZampe(int zampe) {
		this.zampe = zampe;
	}
	public void setTipoPiume(String tipoPiume) {
		this.tipoPiume = tipoPiume;
	}
	public void setColoriPiumaggio(String[] coloriPiumaggio) {
		this.coloriPiumaggio = coloriPiumaggio;
	}
	public void setVola(boolean vola) {
		Vola = vola;
	}
	public void setNuota(boolean nuota) {
		Nuota = nuota;
	}
	public void setMesiPerLaSchiusura(int mesiPerLaSchiusura) {
		this.mesiPerLaSchiusura = mesiPerLaSchiusura;
	}
	public void setTempoDiGravidanza(int tempoDiGravidanza) {
		this.tempoDiGravidanza = tempoDiGravidanza;
	}
}
