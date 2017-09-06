package ch02.item01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 提供者注册API
 * @author bcc
 *
 */
public class Services {

	/**
	 * 私有构造器
	 */
	private Services() { }

	/**
	 * 服务map
	 */
	private static final Map<String,Provider> providers = new ConcurrentHashMap<String,Provider>();

	public static final String DEFAULT_PROVIDER_NAME = "<def>";

	/**
	 * 服务注册接口
	 * @param p
	 */
    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    /**
     * 服务注册接口
     * @param name
     * @param p
     */
    public static void registerProvider(String name, Provider p){
        providers.put(name, p);
    }

    /**
     * 服务访问接口
     * @return
     */
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    /**
     * 服务访问接口
     * @param name
     * @return
     */
    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null){
            throw new IllegalArgumentException(
                "No provider registered with name: " + name);
        }
        return p.newService();
    }
}
