package com.test01;

public class AllPermission {

	private void privateHi() {
		System.out.println("privateHi");
	}

	void defaultMethod() {
		
		System.out.println("defaultMethod");
		
	}
	
	protected void protectedMethon() {
		
		System.out.println("protectedMethon");
		
	}
	
	public void publicMethod() {
		
		System.out.println("publicMethod");

	}

}
