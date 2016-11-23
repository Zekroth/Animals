package Astratti;

public abstract class Rettili extends Animali {
	private int coda = 1;//ha un coda? si = true || falso no
	private int occhi = 2;// ha 2 occhi? si = true || falso no
	private int tSottoAcqua; // si va stto acqua? si = true || falso= no

	private boolean hannoSangueFredda;// ha sangue fredda? si = true || falso no
	

 public boolean comeMangiano(){
	 System.out.println("con la bocca");
	 return true;
 }
 public boolean comeSiSpostano(){
	 System.out.println("Striciano");
	return true; 
 }
 public abstract boolean comeSiRiproduzione();
 public  boolean comeAssumonoOssigeno(){
	 System.out.println("Con i polmoni");
  return true;
 }
 
 //get and set 
 public int getCoda() {
	return coda;
}
public void setCoda(int coda) {
	this.coda = coda;
}
public int getOcchi() {
	return occhi;
}
public void setOcchi(int occhi) {
	this.occhi = occhi;
}
public int gettSottoAcqua() {
	return tSottoAcqua;
}
public void settSottoAcqua(int tSottoAcqua) {
	this.tSottoAcqua = tSottoAcqua;
}

public boolean isHannoSangueFredda() {
	return hannoSangueFredda;
}
public void setHannoSangueFredda(boolean hannoSangueFredda) {
	this.hannoSangueFredda = hannoSangueFredda;
}

}