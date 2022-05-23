package homero;

public class Homerseklet {
	
	double homersekelt;
	Mertekegyseg mertekegyseg;
	
	public Homerseklet(double homersekelt, Mertekegyseg mertekegyseg) {
		super();
		this.homersekelt = homersekelt;
		this.mertekegyseg = mertekegyseg;
	}

	public Homerseklet(double homersekelt) {
		super();
		this.homersekelt = homersekelt;
		this.mertekegyseg = Mertekegyseg.CELSIUS;
	}

	@Override
	public String toString() {
		return "Homerseklet [homersekelt=" + homersekelt + ", mertekegyseg=" + mertekegyseg + "]";
	}

	public double getHomersekelt() {
		return homersekelt;
	}

	public void setHomersekelt(double homersekelt) {
		this.homersekelt = homersekelt;
	}

	public Mertekegyseg getMertekegyseg() {
		return mertekegyseg;
	}

	public void setMertekegyseg(Mertekegyseg mertekegyseg) {
		this.mertekegyseg = mertekegyseg;
	}
	
	public static Homerseklet konvHomerseklet(Homerseklet ho, Mertekegyseg target) {
		
		if(ho.getMertekegyseg() == target) {
			return new Homerseklet(ho.getHomersekelt(), target);
		}else if(ho.getMertekegyseg() == Mertekegyseg.CELSIUS && target == Mertekegyseg.KELVIN) {
			return new Homerseklet(ho.getHomersekelt() + 273.15, target);
		}else {
			return new Homerseklet(ho.getHomersekelt() - 273.15, target);
		}
		
		
	}
	
	
	

}
