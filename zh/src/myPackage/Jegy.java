package myPackage;

import java.time.LocalDate;

public class Jegy {
	
	LocalDate datum;
	kedvezmeny kedvezmeny;
	
	public Jegy(LocalDate datum, kedvezmeny kedvezmeny){
		this.datum = datum;
		this.kedvezmeny = kedvezmeny;
	
	}

	@Override
	public String toString() {
		return "Jegy [datum=" + datum + ", kedvezmeny=" + kedvezmeny + "]";
	}

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}

	public kedvezmeny getKedvezmeny() {
		return kedvezmeny;
	}

	public void setKedvezmeny(kedvezmeny kedvezmeny) {
		this.kedvezmeny = kedvezmeny;
	}
	
	
	public double jegyarSzamitas(int tavolsag, int kmAr, kedvezmeny kedvezmeny, int potjegy){
		
		double jegyAr;
		
		if(kedvezmeny.equals(kedvezmeny.DIAK)){
			jegyAr = (tavolsag * kmAr) * 0.5  + potjegy;
		}
		else if(kedvezmeny.equals(kedvezmeny.NYUGDIJAS)){
			jegyAr = (tavolsag * kmAr) * 0.9  + potjegy;
			
		}
		else{
			jegyAr = tavolsag * kmAr + potjegy;
		}
		
		return jegyAr;
	
	}
	
	
	
	

}
