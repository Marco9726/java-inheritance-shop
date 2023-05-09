package org.lessons.java;

import java.util.Random;

public class Prodotto {

	private String code;
	private String name;
	private String brand;
	private float price;
	private int iva;
	
	public Prodotto ( String name, String brand, float price, int iva) {
		
		Random rnd = new Random();
		code = "" + rnd.nextInt(1000);
		
		setName(name);
		setBrand(brand);
		setPrice(price);
		setIva(iva);	
		
	}
	
//	GETTERS AND SETTERS	
	public String getCode() {
		
		return code;
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public String getBrand() {
		
		return brand;
	}
	public void setBrand(String brand) {
		
		this.brand = brand;
	}
	public float getPrice() {
		
		return price;
	}
	public void setPrice(float price) {
		
		this.price = price;
	}
	public float getIva() {
		
		return iva;
	}
	public void setIva(int iva) {
		
		this.iva = iva;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  getCode() + "\n" +
				getName() + "\n" +
				getBrand() + "\n" +
				getPrice() + "\n" +
				getIva() ;
				
				
	}
	
}
