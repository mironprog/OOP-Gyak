package myPackage;

import java.time.LocalDate;

public class ICjegy extends Jegy {
	private String nev;
	private int kocsiosztaly;
	private int tavolsag;
	private int kmAR;
	private static int potjegy = 450;
	
	
	public ICjegy(LocalDate datum, kedvezmeny kedvezmeny, String nev, int kocsiosztaly, int tavolsag, int kmAr){
		super(datum, kedvezmeny);
		this.nev = nev;
		this.kocsiosztaly = kocsiosztaly;
		
		if(kocsiosztaly == 1){
			kmAr = 30;
		}
		else if(kocsiosztaly == 2){
			kmAr = 25;
		}
		
	}
	
	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getKocsiosztaly() {
		return kocsiosztaly;
	}

	public void setKocsiosztaly(int kocsiosztaly) {
		this.kocsiosztaly = kocsiosztaly;
	}

	public int getTavolsag() {
		return tavolsag;
	}

	public void setTavolsag(int tavolsag) {
		this.tavolsag = tavolsag;
	}

	public int getKmAR() {
		return kmAR;
	}

	public void setKmAR(int kmAR) {
		this.kmAR = kmAR;
	}

	public static int getPotjegy() {
		return potjegy;
	}

	public static void setPotjegy(int potjegy) {
		ICjegy.potjegy = potjegy;
	}
	
	@Override
	public String toString() {
		return "ICjegy [nev=" + nev + ", kocsiosztaly=" + kocsiosztaly + ", tavolsag=" + tavolsag + ", kmAR=" + kmAR
				+ ", datum=" + datum + ", kedvezmeny=" + kedvezmeny + "]";
	}

	public void display(ICjegy[] tomb){
		for(int i = 0; i < tomb.length; i++){
			System.out.println(tomb[i].toString());
		}
	}
	
	public void lejartJegyek(ICjegy[] tomb, LocalDate datum){
		
		ICjegy[] segedTomb = new ICjegy[tomb.length]; 
		
		for(int i = 0; i < tomb.length; i++){
			if(tomb[i].datum.isAfter(datum)){
				segedTomb[i] = tomb[i]; 
				System.out.println(segedTomb[i].toString());
			}
		}
		
		
		
		
		
	}
	

}
