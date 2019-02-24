package factory_implement;

/**
 * 建立物件實做方法
 * 
 * @author Frieda
 *
 */
public class NYCheesePizza implements Pizza {

	@Override
	public String prepare() {
		System.out.println("prepare NY cheese pizza...");
		return "prepare NY cheese pizza...";
	}

	@Override
	public String bake() {
		System.out.println("bake NY cheese pizza...");
		return "bake NY cheese pizza...";
	}

	@Override
	public String cut() {
		System.out.println("cut NY cheese pizza...");

		return "cut NY cheese pizza...";
	}

	@Override
	public String box() {
		System.out.println("boxing NY cheese pizza...");

		return "boxing NY cheese pizza...";
	}

}
