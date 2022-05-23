package myPackage;

import java.util.Arrays;

public class Robot {
	
	private String nev;
	private int[] pozicio;
	private Tipus tipus;
	private String allapot;
	
	public Robot(String nev, int[] pozicio, Tipus tipus, String allapot) {
		super();
		this.nev = nev;
		this.pozicio = pozicio;
		this.tipus = tipus;
		this.allapot = allapot;
	}

	public Robot(String nev) {
		super();
		this.nev = nev;
		this.pozicio[0] = 0;
		this.pozicio[1] = 0;
		this.tipus = Tipus.SZOCIALIS;
		this.allapot = "Tetlen";
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int[] getPozicio() {
		return pozicio;
	}

	public void setPozicio(int[] pozicio) {
		this.pozicio = pozicio;
	}

	public Tipus getTipus() {
		return tipus;
	}

	public void setTipus(Tipus tipus) {
		this.tipus = tipus;
	}

	public String getAllapot() {
		return allapot;
	}

	public void setAllapot(String allapot) {
		this.allapot = allapot;
	}

	@Override
	public String toString() {
		return "Robot [nev=" + nev + ", x koordinata=" + pozicio[0] + ", y koordinata=" + pozicio[1] + ", tipus=" + tipus + ", allapot="
				+ allapot + "]";
	}
	
	public static int[] euklidesziTavolsag(int pozicio[]) {
		return new int[2];
	}
	
	
	
	

}
