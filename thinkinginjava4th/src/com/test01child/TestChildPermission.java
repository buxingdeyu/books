package com.test01child;

import com.test01.AllPermission;

public class TestChildPermission extends AllPermission {

	public static void main(String[] args) {
		TestChildPermission obj = new TestChildPermission();
		obj.protectedMethon();
		obj.publicMethod();
//		obj.defaultMethod();
	}
}
