package ch02.item03.staticinnerclass;

/**
 * 静态内部类
 * @author hero
 *
 */
public class Elvis {

	private static class SingletonHolder{

		private static final Elvis INSTANCE = new Elvis();
	}

	private Elvis(){}

	public static synchronized Elvis getInstance(){
 		return SingletonHolder.INSTANCE;
	}
}
