package chapter08;

public class PrivateOverride {

	private void f(){
		System.out.println("parent f()");
	}
	
	public void pf(){
		System.out.println("parent pf()");
		
	}
	
	public static void main(String [] args){
		PrivateOverride obj = new Derived();
		obj.f();
		obj.pf();
	}
	
}
class Derived extends PrivateOverride{
	
	public void pf(){
		System.out.println("Derived pf()");
	}
	
	public void f(){
		System.out.println("Derived f()");
	}
}
