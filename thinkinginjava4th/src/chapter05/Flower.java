package chapter05;

public class Flower {

	int petalCount = 0 ;
	
	String s = "initial value";
	
	public Flower(int petals) {
		petalCount = petals ;
		System.out.println(" Counstructor w/  int  arg only , petalCount= "+ petalCount);
	}
	
	Flower(String ss){
		System.out.println(" Counstructor w/  String  arg only , s= "+ ss);
		s=ss;
	}
	
	Flower(String s,int petals){
		this(s);
		System.out.println("String & int args");
	}
	
}
