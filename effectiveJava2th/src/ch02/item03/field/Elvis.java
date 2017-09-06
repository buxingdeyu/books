package ch02.item03.field;

/**
 * public 的静态属性实现单例
 * @author hero
 *
 */
public class Elvis {
	private Elvis() {
	}

	public static Elvis INSTANCE = new Elvis();

	public void leaveTheBuilding() {
		System.out.println("Whoa baby, I'm outta here!");
	}

	// This code would normally appear outside the class!
	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}
}
