package homero;

import java.util.Scanner;

public class HoProba {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Homerseklet ho1 = readHomerseklet();
		Homerseklet ho2 = readHomerseklet();
		System.out.println(ho1);
		System.out.println(ho2);
		
		Homerseklet[] hos = new Homerseklet[]{
				readHomerseklet(),
				readHomerseklet(),
				generate(),
				generate()
		};
		printHos(hos);
		System.out.println(Homerseklet.konvHomerseklet(hos[0], Mertekegyseg.KELVIN));
		System.out.println(Homerseklet.konvHomerseklet(hos[1], Mertekegyseg.CELSIUS));
		
		sc.close();
		

	}
	static double avg(Homerseklet[] hos){
		double temperatureSum = 0;
		for(Homerseklet ho : hos){
			double temperature;
			if(ho.getMeter() == Mertekegyseg.KELVIN){
				temperature = Homerseklet.konvHomerseklet(hos, Mertekegyseg.KELVIN).getTemperature();
			}else{
				temperature = ho.getTemperature();
			}
			temperatureSum += temperature;
		}
		return temperatureSum / hos.length;
	}
	
	static void printHos(Homerseklet[] hos){
		for(Homerseklet ho : hos){
			System.out.println(ho);
		}
		
	}
	
	static Homerseklet generate(){
		return new Homerseklet(Math.random() + 100);
	}
	
	
	
	
	static Homerseklet readHomerseklet(){
		boolean ok;
		do{
			try{
			Double.parseDouble(sc.nextLine());
			
			}catch(NumberFormatException e){
				System.out.println("Wrong format! Try again");
				ok = false;
				continue;
			}
			String me = sc.nextLine();
			
			Mertekegyseg meEnum;
			if(me.equals("C")){
				
				meEnum = Mertekegyseg.CELSIUS;
				
			}else if(me.equals("K")){
				meEnum = Mertekegyseg.KELVIN;
			}else{
				System.out.println("Type C or K!");
				ok = false;
				continue;
			}
			double temperature;
			if(meEnum == Mertekegyseg.CELSIUS && temperature < 273.15){
				System.out.println("Bad interval!");
				ok = false;
				continue;
			}else if(meEnum == Mertekegyseg.KELVIN && temperature < 0){
				System.out.println("Bad interval!");
				ok = false;
				continue;
			}
			return new Homerseklet(temperature, meEnum);
		
		
	}while(!ok);

}
	
}
