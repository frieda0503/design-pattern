package sharing3_factory;

/**
 * 乘法計算
 * 
 * @author Frieda
 *
 */
public class CalulatorMultipleFactory implements CalculatorFactory {
	@Override
	public int getResult(int a, int b) {
		return a * b;
	}
}

