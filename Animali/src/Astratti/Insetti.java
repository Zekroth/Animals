package Astratti;

public abstract class Insetti extends Animali {
	private int zampe ;//quante zampe hanno? n zampe
	private int occhi ;//Quanti occhi hanno? n occhi
	private int SottoAcqua; //vanno sott'acqua? true=si false=no
	private boolean sonoVelenosi;// sono velenosi? true=si false=no
	private boolean volano; // volano? true=si false=no
	//metodi get e set
	public int getOcchi() {
		return occhi;
	}

	public void setOcchi(int occhi) {
		this.occhi = occhi;
	}

	public int getZampe() {
		return zampe;
	}

	public void setZampe(int zampe) {
		this.zampe = zampe;
	}

	public int getSottoAcqua() {
		return SottoAcqua;
	}

	public void setSottoAcqua(int tSottoAcqua) {
		this.SottoAcqua = tSottoAcqua;
	}

	public boolean isSonoVelenosi() {
		return sonoVelenosi;
	}

	public void setSonoVelenosi(boolean sonoVelenosi) {
		this.sonoVelenosi = sonoVelenosi;
	}
	
	public boolean comeMangiano(){
		System.out.println("Con la lingua");
		return true;
	}
	
	public boolean volano() {
		return volano;
	}

	public void setvolano(boolean volano) {
		this.volano = volano;
	}
	
	
}

