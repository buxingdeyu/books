package ch02.item03.doublecheck;

/**
 * 多重校验锁
 * @author hero
 *
 */
public class Elvis {

	private static Elvis INSTANCE;

	private Elvis(){}

	public static Elvis getInstance(){
		if(null == INSTANCE){
			synchronized(Elvis.class){
				if(INSTANCE == null){
					INSTANCE = new Elvis();
				}
			}
		}
		return INSTANCE;
	}
}
