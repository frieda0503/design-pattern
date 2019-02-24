package sharing3_simple_factory;

/**
 * 
 * @author Frieda
 *
 */
public class CalculatorStore {
	int a = 1;
	int b = 2;
	
	// 在此使用了靜態的方法，優點是不用new出instance就可以使用，缺點是不可透過繼承的方式改變它的行為
//	// 加入工廠
//	CalculatorSimpleFactory factory = new CalculatorSimpleFactory();
//
//	// 工廠做為參數
//	public CalculatorFactory(CalculatorSimpleFactory factory) {
//		this.factory = factory;
//	}

	public Calculator getCalculator(String operator) throws Exception {
		Calculator calculator = null;
		
		calculator = CalculatorSimpleFactory.getCalculator(operator);
		
		return calculator;
	}

}
