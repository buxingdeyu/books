package com.test01;

public class TestPrivateObj {

	public static void main(String[] args) {
		AllPermission obj = new AllPermission();
		obj.protectedMethon();
		obj.publicMethod();
		obj.defaultMethod();
	}

}
