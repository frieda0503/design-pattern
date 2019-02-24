package sharing3_simple_factory;

/**
 * 規範計算邏輯的方法<br>
 * 透過interface可以在類別裡面去實做，但當使用大量的實體化(new)時等於是自找麻煩
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
