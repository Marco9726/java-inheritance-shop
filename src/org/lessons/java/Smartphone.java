package org.lessons.java;

public class Smartphone extends Prodotto{
	
	private String imei;
	private int gb;
	
//	CONSTRUCTOR 
	public Smartphone ( String name, String brand, float price, int iva, String imei, int gb) {
		
		super(name, brand, price, iva);
		
		setImei(imei);
		setGb(gb);
		
	}

//	GETTERS AND SETTERS
	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public int getGb() {
		return gb;
	}

	public void setGb(int gb) {
		this.gb = gb;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "(S)" + getProductStr()
				+ getImei() + "\n" +
				getGb();
	}
}
