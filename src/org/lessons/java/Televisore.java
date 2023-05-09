package org.lessons.java;

public class Televisore extends Prodotto{

	private int size;
	private boolean smart;
	
//	CONSTRUCTOR 
	public Televisore ( String name, String brand, float price, int iva, int size, boolean smart) {
		
		super(name, brand, price, iva);
		
		setSize(size);
		setSmart(smart);
		
	}
	
//	GETTERS AND SETTERS
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean isSmart() {
		return smart;
	}
	
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  getCode() + "\n" +
				getName() + "\n" +
				getBrand() + "\n" +
				getPrice() + "\n" +
				getIva() + "\n" +
				getSize() + "\n" +
				isSmart();
	}
}
