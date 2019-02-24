package factory_implement;

/**
 * 建立物件實做方法
 * 
 * @author Frieda
 *
 */
public class TomatoSaucePizza implements Pizza {

	@Override
	public String prepare() {
		System.out.println("prepare tomato sauce pizza...");
		return "prepare tomato sauce pizza...";
	}

	@Override
	public String bake() {
		System.out.println("bake tomato sauce pizza...");
		return "bake tomato sauce pizza...";
	}

	@Override
	public String cut() {
		System.out.println("cut tomato sauce pizza...");
		return "cut tomato sauce pizza...";
	}

	@Override
	public String box() {
		System.out.println("boxing tomato sauce pizza...");
		return "boxing tomato sauce pizza...";
	}

}
