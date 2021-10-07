package com.hsbc;

public class SelectVehicle {
	public static void main(String[] args) {
		System.out.println("KTM instance");
		Ktm ktm = new Ktm();
		AutomobileUI.printVehicle(ktm);
		System.out.println("Royal Enfield instance");
		RoyalEnfield rf = new RoyalEnfield();
		AutomobileUI.printVehicle(rf);
		System.out.println("Skoda instance");
		Skoda s = new Skoda();
		AutomobileUI.printVehicle(s);
		System.out.println("Alto instance");
		Alto alt = new Alto();
		AutomobileUI.printVehicle(alt);
		System.out.println("BMW instance");
		BMW bmw = new BMW();
		AutomobileUI.printVehicle(bmw);
		
		
		
	}

}
