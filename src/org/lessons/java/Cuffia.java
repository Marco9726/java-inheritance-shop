package org.lessons.java;

public class Cuffia extends Prodotto{

	private String color;
	private boolean wireless;
	
//	CONSTRUCTOR 
	public Cuffia ( String name, String brand, float price, int iva, String color, boolean wireless) {
		
		super(name, brand, price, iva);
		
		setColor(color);
		setWireless(wireless);
		
	}
	
//	GETTERS AND SETTERS
	public String getColor() {
		
		return color;
	}
	public void setColor(String color) {
		
		this.color = color;
	}
	
	public boolean isWireless() {
		
		return wireless;
	}
	public void setWireless(boolean wireless) {
		
		this.wireless = wireless;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  getCode() + "\n" +
				getName() + "\n" +
				getBrand() + "\n" +
				getPrice() + "\n" +
				getIva() + "\n" +
				getColor() + "\n" +
				isWireless();
	}
}