package ch02.item03.hungrynotsafe;

/**
 * 饿汉，线程不安全
 * @author hero
 *
 */
public class Elvis {

	private static Elvis INSTANCE;

	private Elvis(){}

	public static Elvis getInstance(){
		if(null == INSTANCE){
			INSTANCE = new Elvis();
		}
		return INSTANCE;
	}
}
