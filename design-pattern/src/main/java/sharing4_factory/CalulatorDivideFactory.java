package sharing4_factory;

/**
 * 加法計算
 * 
 * @author Frieda
 *
 */
public class CalulatorDivideFactory implements CalculatorFactory {
	@Override
	public int getResult(int a, int b) {
		return a / b;
	}
}
