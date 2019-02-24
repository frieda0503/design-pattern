package simple_factory_implement_answer;

/**
 * 建立物件實做方法
 * 
 * @author Frieda
 *
 */
public class CheesePizza implements Pizza {

	@Override
	public String prepare() {
		System.out.println("prepare cheese pizza...");
		return "prepare cheese pizza...";
	}

	@Override
	public String bake() {
		System.out.println("bake cheese pizza...");
		return "bake cheese pizza...";
	}

	@Override
	public String cut() {
		System.out.println("cut cheese pizza...");
		return "cut cheese pizza...";
	}

	@Override
	public String box() {
		System.out.println("boxing cheese pizza...");
		return "boxing cheese pizza...";
	}

}
