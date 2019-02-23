package sharing3_simple_factory;

/**
 * 規範計算邏輯的方法
 * 
 * @author Frieda
 *
 */
public interface Calculator {

	/**
	 * 計算邏輯各自實作
	 * 
	 * @return
	 */
	public abstract int getResult(int a, int b);

}
