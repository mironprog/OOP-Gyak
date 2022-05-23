package myPackage;

import java.util.Arrays;

public class JatekRobot extends Robot{

	private int eletszint;
	

	

	public JatekRobot(String nev, int[] pozicio, Tipus tipus, String allapot, int eletszint) {
		super(nev, pozicio, tipus, allapot);
		this.eletszint = 100;
		this.setTipus(Tipus.JATEK);
		this.setAllapot("Tetlen");
		this.setPozicio(pozicio);
		
	
		
	}
	


	@Override
	public String toString() {
		return "JatekRobot [eletszint=" + eletszint + ", tipus=" + getTipus() + ", allapot=" + getAllapot() + ", getNev()="
				+ getNev() + ", getPozicio()=" + Arrays.toString(getPozicio()) + "]";
	}

	public int getEletszint() {
		return eletszint;
	}

	public void setEletszint(int eletszint) {
		this.eletszint = eletszint;
	}
	
	

	
	

}
