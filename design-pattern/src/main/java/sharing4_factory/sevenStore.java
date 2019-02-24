package sharing4_factory;

/**
 * 
 * @author Frieda
 *
 */
public class sevenStore extends CalculatorStore {

	@Override
	Calculator getCalculatorMethod(String operator) throws Exception {
		Calculator calculator = null;
		switch (operator) {
		case "+":
			calculator = new SevenCalulatorAdd();
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

		return calculator;

	}

}
