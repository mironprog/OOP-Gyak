package otherPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;

import myPackage.*;


public class Runner {

	
	public static void main(String[] args) throws AWTException {
		
		
		Robot[] robotok = new Robot[3];
		
		for(int i = 0; i < robotok.length; i++) {
			robotok[i] = robotBeolvas(robotok);
		}
		display(robotok);
		displayJatek(robotok);
		
		
	
	
	
	
	}

	public static Robot robotBeolvas(Robot[] robotok) throws AWTException {
		for(int i = 0; i < robotok.length; i++) {
			Scanner sc = new Scanner(System.in);
			int n = 0;
			String nev, allapot = null, sTipus;
			int[] pozicio = {0, 0};
			Tipus tipus;
			int eletero;
			
			
			
			System.out.println("Adja meg a Robot nevet:");
			nev = sc.next();
			
			do {	
				System.out.println("Adja meg a x poziciot:");
				while(!sc.hasNextInt()) {
					System.out.println("Hibas adat!");
					sc.next();
				}
				
				pozicio[0] = sc.nextInt();
				
			}while(pozicio[0] < 0 || pozicio[0] > 10);
			
			do {	
				System.out.println("Adja meg a y poziciot:");
				while(!sc.hasNextInt()) {
					System.out.println("Hibas adat!");
					sc.next();
				}
				
				pozicio[1] = sc.nextInt();
				
			}while(pozicio[1] < 0 || pozicio[1] > 20);
			
			System.out.println("Adja meg a típusát: ");
			sTipus = sc.next();
			tipus = String.valueOf(sTipus);
			
			if(tipus == Tipus.JATEK) {
				System.out.println("Adja meg az életerőt: ");
				eletero = sc.nextInt();
				//robotok[i] = new JatekRobot(nev, pozicio,tipus,allapot,eletero);
			}
			
			System.out.println("Adja meg az allapotot: ");
			allapot = sc.next();
			
			return robotok[i] = new Robot(nev, pozicio, tipus, allapot);
				
			
			
			
			
		}
	}
	
	public static void display(Robot[] robotok) {
		for(int i = 0; i < robotok.length; i++) {
			System.out.println(robotok.toString());
		}
	}
	
	public static void displayJatek(Robot[] robotok) {
		for(int i = 0; i < robotok.length; i++) {
			if(robotok[i].tipus == Tipus.JATEK) {
				System.out.println(robotok.toString());
			}
		}
	}
	
	public static void mozgatas(Robot[] robotok, int[] pozicio) {
		robotok.setPozicio(pozicio);
	}

}
