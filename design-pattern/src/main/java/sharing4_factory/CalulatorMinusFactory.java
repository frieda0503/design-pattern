package sharing4_factory;

/**
 * 減法計算
 * 
 * @author Frieda
 *
 */
public class CalulatorMinusFactory implements CalculatorFactory {
	@Override
	public int getResult(int a, int b) {
		return a - b;
	}
}
