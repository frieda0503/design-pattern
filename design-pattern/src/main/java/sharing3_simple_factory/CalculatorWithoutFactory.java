package sharing3_simple_factory;

/**
 * 
 * @author Frieda
 *
 */
public class CalculatorWithoutFactory {
	int a = 1;
	int b = 2;

	/**
	 * 取得計算機，輸入數字a,b，運算方法operator，進行相對應的計算
	 * 
	 * @param a
	 * @param b
	 * @param operate
	 * @return
	 * @throws Exception
	 */
	public Calculator getCalculator(String operator) throws Exception {
		Calculator calculator = null;
		switch (operator) {
		case "+":
			calculator = new CalulatorAdd();
			break;
		case "-":
			calculator = new CalulatorMinus();
			break;
		case "*":
			calculator = new CalulatorMultiple();
			break;
		case "/":
			calculator = new CalulatorDivide();
			break;
		default:
			throw new Exception("輸入錯誤");
		}

		calculator.getResult(a, b);
		return calculator;
	}

}
