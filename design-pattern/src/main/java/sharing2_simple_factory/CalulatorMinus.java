package sharing2_simple_factory;

/**
 * 減法計算
 * 
 * @author Frieda
 *
 */
public class CalulatorMinus implements Calculator {
	@Override
	public int getResult(int a, int b) {
		return a - b;
	}
}
