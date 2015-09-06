package com.romaremedysolutions;

public class Customer {
	private int customerId;
	public int getCustomerId() {
		return customerId;
	}
}
class Retail {
	public static void main(String[] args) {
	Customer customObject = new Customer();
	System.out.println("huhu " + customObject.getCustomerId());
		
	}

}
