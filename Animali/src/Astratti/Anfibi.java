package Astratti;

public abstract class Anfibi extends Animali {
	private int zampe = 4;
	private int occhi = 2;
	private int tSottoAcqua;
	private boolean sonoVelenosi;
	
	protected abstract boolean comeNuotano();
	protected abstract boolean comeCamminano();
	
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

	public int gettSottoAcqua() {
		return tSottoAcqua;
	}

	public void settSottoAcqua(int tSottoAcqua) {
		this.tSottoAcqua = tSottoAcqua;
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
}
