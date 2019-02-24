package sharing4_factory;

/**
 * 加法計算
 * 
 * @author Frieda
 *
 */
public class SevenCalulatorAdd implements Calculator {
	@Override
	public int getResult(int a, int b) {
		return a + b + 10;
	}
}
