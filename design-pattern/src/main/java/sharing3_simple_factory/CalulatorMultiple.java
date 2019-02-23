package sharing3_simple_factory;

/**
 * 乘法計算
 * 
 * @author Frieda
 *
 */
public class CalulatorMultiple implements Calculator {
	@Override
	public int getResult(int a, int b) {
		return a * b;
	}
}

