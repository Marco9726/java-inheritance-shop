package org.lessons.java;



public class Shop {
	
	public static void main(String[] args) {
		
		Prodotto p1 = new Prodotto("Monitor", "Logitech", 99 , 22);
		System.out.println(p1);
		
		System.out.println("-------------------");
		
		Smartphone s1 = new Smartphone("iPhone11", "Apple", 599 , 22, "HSBSGAH", 64);
		System.out.println(s1);

		System.out.println("-------------------");
		
		Televisore t1 = new Televisore("QLED", "Smaung", 499 , 22, 55, true);
		System.out.println(t1);

		System.out.println("-------------------");
		
		Cuffia c1 = new Cuffia("AirPods", "Apple", 199 , 22, "bianco", false);
		System.out.println(c1);	
		
	}
}
