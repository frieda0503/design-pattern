package factory_implement;

/**
 * 建立物件實做方法
 * 
 * @author Frieda
 *
 */
public class VeggiePizza implements Pizza {

	@Override
	public String prepare() {
		System.out.println("prepare veggie pizza...");
		return "prepare veggie pizza...";
	}

	@Override
	public String bake() {
		System.out.println("bake veggie pizza...");
		return "bake veggie pizza...";
	}

	@Override
	public String cut() {
		System.out.println("cut veggie pizza...");
		return "cut veggie pizza...";
	}

	@Override
	public String box() {
		System.out.println("boxing veggie pizza...");
		return "boxing veggie pizza...";
	}

}
