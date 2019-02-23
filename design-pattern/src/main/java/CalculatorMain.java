import sharing2_without_factory.CalculatorWithoutFactory;
import sharing3_simple_factory.Calculator;
import sharing3_simple_factory.CalculatorSimpleFactory;
import sharing4_factory.CalculatorAddFactory;
import sharing5_abstract_factory.ApplianceFactory;
import sharing5_abstract_factory.ClothesFactory;

/**
 * 工廠模式demo
 * 
 * @author Frieda
 *
 */
public class CalculatorMain {
	// 輸入值
	static int a = 10000;
	static int b = 25000;
	static String operator = "+";

	public static void main(String[] args) {
		calculator();
		calculatorSimpleFactory();
		calculatorFactory();
		abstractCalculatorFactory();
	}

	/**
	 * 業務邏輯與UI拆開的簡易計算機
	 */
	public static void calculator() {
		System.out.println(">>>> Calculator without factory 測試 <<<< ");

		try {
			// 計算並輸出
			System.out.println("輸入: " + a + operator + b);
			CalculatorWithoutFactory calculator = new CalculatorWithoutFactory();
			int result = calculator.calculate(a, b, operator);
			System.out.println("計算結果： " + a + operator + b + " = " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("======================================");
	}

	/**
	 * 使用簡單工廠模式(SimpleFactory Pattern)實現簡易計算機
	 */
	public static void calculatorSimpleFactory() {
		System.out.println(">>>> Calculator Simple Factory 測試 <<<< ");

		try {
			System.out.println("輸入: " + a + operator + b);
			Calculator calculator = CalculatorSimpleFactory.getCalculator(operator);
			int result = calculator.getResult(a, b);
			System.out.println("計算結果： " + a + operator + b + " = " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("======================================");
	}

	/**
	 * 使用工廠模式(Factory Pattern)實現計算機
	 */
	public static void calculatorFactory() {
		System.out.println(">>>> Calculator Factory 測試 <<<< ");

		try {
			System.out.println("輸入: " + a + " + " + b);
			CalculatorAddFactory calculator = new CalculatorAddFactory();
			int result = calculator.getResult(a, b);
			System.out.println("計算結果： " + a + " + " + b + " = " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("======================================");
	}

	/**
	 * 使用抽象工廠模式(Abstract Factory Pattern)實現計算機
	 */
	public static void abstractCalculatorFactory() {
		System.out.println(">>>> Calculator Abstract Factory 測試 <<<< ");

		try {
			System.out.println("輸入: " + a + " + " + b);
			CalculatorAddFactory calculator = new CalculatorAddFactory();
			int result = calculator.getResult(a, b);
			System.out.println("計算結果： " + a + " + " + b + " = " + result);

			// 家電館
			ApplianceFactory applianceFactory = new ApplianceFactory();
			int discount = applianceFactory.getDiscount(result);
			int coupon = applianceFactory.getCoupon(result);
			System.out.println("優惠價格(打八折)： " + discount + " , " + " 優惠卷(滿1萬送2張券<累積>)： " + coupon);

			// 少淑女服飾
			ClothesFactory clothesFactory = new ClothesFactory();
			int cDiscount = clothesFactory.getDiscount(result);
			int cCoupon = clothesFactory.getCoupon(result);
			System.out.println("優惠價格(滿5000送500)： " + cDiscount + " , " + " 優惠卷(滿2萬送1張券<無累積>)： " + cCoupon);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("======================================");
	}
}
