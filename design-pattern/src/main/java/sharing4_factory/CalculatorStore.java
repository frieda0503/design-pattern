package sharing4_factory;


/**
 * 
 * @author Frieda
 *
 */
public abstract class CalculatorStore {
	int a = 1;
	int b = 2;

	// 把取得計算機的方法再移回來
	public Calculator getCalculator(String operator) throws Exception {
		Calculator calculator = null;

		calculator = getCalculatorMethod(operator);

		return calculator;
	}

	abstract Calculator getCalculatorMethod(String operator) throws Exception;

}
