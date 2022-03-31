package myPackage.test;

import java.util.Arrays;

import myPackage.Cylinder;
import myPackage.Prism;
import myPackage.Rectangle;
import myPackage.Manager.PrismManager;

public class PrismTest {

	public static void main(String[] args) {
		PrismManager pm = new PrismManager(5);
		pm.setPrism(0,  new Cylinder(4,4));
		pm.setPrism(0, new Rectangle(4, 4, 4));
		System.out.println("Instances in manager: " + pm.getPrismInstanceCount());
		System.out.println("Average volume: " + pm.getAverageVolume());
		System.out.println(pm);
		
		
		
		/*Cylinder c = new Cylinder(12.5, 6);
		System.out.println(c);
		
		Prism pc = new Cylinder(1, 1);
		System.out.println(pc);*/
		
		/*Prism[] prisms = {new Cylinder(6,5), new Rectangle(3, 2.5, 12)};
		printPrisms(prisms);
		printVolumes(prisms);
		printCylinders(prisms);

	}
	
	public static void printPrisms(Prism[] prisms){
		for(Prism p : prisms){
			System.out.println(p);
		}
	}
	
	public static void printVolumes(Prism[] prisms){
		for(Prism p : prisms){
			System.out.println(p.getVolume());
		}
	}
	public static void printCylinders(Prism[] prisms){
		for(Prism p : prisms){
			System.out.println(p.getVolume());
		}*/
	}

}
