package ch02.item04;

/**
 * 私有化构造函数
 * @author hero
 *
 */
public class UtilityClass {
    // Suppress default constructor for noninstantiability
    private UtilityClass() {
        throw new AssertionError();
    }
}

