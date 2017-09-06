package ch02.item03.hungrysafe;

/**
 * 饿汉，线程安全
 * @author hero
 *
 */
public class Elvis {

	private static Elvis INSTANCE;

	private Elvis(){}

	public static synchronized Elvis getInstance(){
		if(null == INSTANCE){
			INSTANCE = new Elvis();
		}
		return INSTANCE;
	}
}
