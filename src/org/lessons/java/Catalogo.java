package org.lessons.java;

import java.util.Scanner;

import org.lessons.java.Prodotto;
import org.lessons.java.Televisore;
import org.lessons.java.Smartphone;
import org.lessons.java.Cuffia;

public class Catalogo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Prodotto [] catalogo = new Prodotto[100];
		
		int counter = 0;
		int userVal = -1;
		
		while ( true ) {
			
			System.out.println("-------------------");
			System.out.println("1 - Inserire nuovo prodotto");
			System.out.println("2 - Stampare catalogo e uscire");
			userVal = sc.nextInt();
			System.out.println("-------------------");
			
			if (userVal < 1 || userVal > 2) {
				
				System.out.println("Scelta non compresa, ritentare");
				continue;
			}
			if (userVal == 2) break;
			
			System.out.println("Cosa prodotto vuoi inserire ?:");
			System.out.println("1 - Smartphone");
			System.out.println("2 - Televisore");
			System.out.println("3 - Cuffia");
			System.out.println("4 - Esci");
			
			int choice = sc.nextInt();
			
			
			if (choice < 1 || choice > 3 ) {
				
				System.err.println("Scelta non trovata");
				
				continue;
				
			}
			
			
			System.out.println("Nome prodotto: ");				
			String name = sc.next();
			
			System.out.println("Marca: ");	
			String brand = sc.next();
			
			System.out.println("Prezzo: ");	
			float price = sc.nextFloat();
			
			System.out.println("Iva %: ");	
			int iva = sc.nextInt();
			
			switch (choice) {
				case 1: {
					System.out.println("IMEI: ");	
					String imei = sc.next();
					
					System.out.println("GB: ");	
					int bg = sc.nextInt();	
					
					Smartphone sp = new Smartphone ( name, brand, price, iva, imei, bg);
					catalogo[counter++]  = sp;
					
					
				}
				break;
				case 2: {
					System.out.println("Pollici: ");	
					int size = sc.nextInt();
					
					System.out.println("Smart?");	
					boolean smart = sc.nextBoolean();
					
					Televisore tv =	new Televisore ( name, brand, price, iva, size, smart);
					catalogo[counter++] = tv;
					
				}
				break;
				case 3: {
					System.out.println("Colore: ");	
					String color = sc.next();
					
					System.out.println("Wireless? ");	
					boolean wireless = sc.nextBoolean();
					
					Cuffia cf = new Cuffia ( name, brand, price, iva, color, wireless);
					catalogo[counter++] = cf;
				}
				break;
				
					
			}
		
		
		}
		for (int x=0;x<counter;x++) {
			
			Prodotto p = catalogo[x];
			System.out.println(p);
			System.out.println("--------------------");
		}		
	}

}
