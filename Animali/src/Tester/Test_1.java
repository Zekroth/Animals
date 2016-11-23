package Tester;

import Astratti.*;

public class Test_1 {

	public static void main(String[] args) {
		Rane rana_toro = new Rane();
		System.out.println(rana_toro.getZampe());
	}

}
class Rane extends Anfibi{

	@Override
	protected boolean comeNuotano() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean comeCamminano() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comeSiSpostano() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comeAssumonoOssigeno() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comeSiRiproducono() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
