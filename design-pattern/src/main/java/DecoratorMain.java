import sharing1_decorator.Egg;
import sharing1_decorator.Noodle;
import sharing1_decorator.PorkChop;
import sharing1_decorator.PorkChopSpareRibUdon;
import sharing1_decorator.SpareRibUdon;
import sharing1_decorator.Vegetable;

/**
 * 麵店(裝飾模式)
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
		Noodle noodle = new PorkChopSpareRibUdon();

		System.out.println(noodle.getDescription() + " cost:"
				+ noodle.getCost() + ",price:" + noodle.getPrice());

		System.out.println("======================================");
	}

	/**
	 * 裝飾物件實作
	 */
	public static void mixNoodle() {
		System.out.println(">>>> Noodle with decorator 測試 <<<< ");
		Noodle noodle = new SpareRibUdon();
		noodle = new PorkChop(noodle);
		noodle = new Vegetable(noodle);
		noodle = new Egg(noodle);

		System.out.println(noodle.getDescription() + " cost:"
				+ noodle.getCost() + ",price:" + noodle.getPrice());

		System.out.println("======================================");
	}
}
