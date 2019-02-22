import sharing5_decorator.Egg;
import sharing5_decorator.Noodle;
import sharing5_decorator.PorkChop;
import sharing5_decorator.Udon;
import sharing5_decorator.Vegetable;

/**
 * 打扮(裝飾模式)
 * 
 * @author Frieda
 *
 */
public class DecoratorMain {
	public static void main(String[] args) {
		basicNoodle();
		mixNoodle();
	}

	/**
	 * 主要物件實作
	 */
	public static void basicNoodle() {
		System.out.println(">>>> Noodle without decorator 測試 <<<< ");
		Noodle noodle = new Udon();

		System.out.println(noodle.getDescription() + " cost:"
				+ noodle.getCost() + ",price:" + noodle.getPrice());

		System.out.println("======================================");
	}

	/**
	 * 裝飾物件實作
	 */
	public static void mixNoodle() {
		System.out.println(">>>> Noodle with decorator 測試 <<<< ");
		Noodle noodle = new Udon();
		noodle = new PorkChop(noodle);
		noodle = new Vegetable(noodle);
		noodle = new Egg(noodle);

		System.out.println(noodle.getDescription() + " cost:"
				+ noodle.getCost() + ",price:" + noodle.getPrice());

		System.out.println("======================================");
	}
}
