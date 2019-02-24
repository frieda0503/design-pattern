package simple_factory_implement;

/**
 * 建立物件實做方法
 * 
 * @author Frieda
 *
 */
public class VeggiePizza implements Pizza {

	@Override
	public String prepare() {
		return "prepare veggie pizza...";
	}

	@Override
	public String bake() {
		return "bake veggie pizza...";
	}

	@Override
	public String cut() {
		return "cut veggie pizza...";
	}

	@Override
	public String box() {
		return "boxing veggie pizza...";
	}

}
