package sharing3_factory;

/**
 * Factory Pattern<br>
 *
 * 優點是容易擴充與維護，只需要在創建一個class實作，不會修改到既有程式碼<br>
 * 缺點是程式碼被拆的很散
 * 
 * @author Frieda
 *
 */
public interface CalculatorFactory {

	public int getResult(int a, int b);
}
