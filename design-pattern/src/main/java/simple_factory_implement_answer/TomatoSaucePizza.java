package simple_factory_implement_answer;

/**
 * 建立物件實做方法
 * 
 * @author Frieda
 *
 */
public class TomatoSaucePizza implements Pizza {

	@Override
	public String prepare() {
		return "prepare tomato sauce pizza...";
	}

	@Override
	public String bake() {
		return "bake tomato sauce pizza...";
	}

	@Override
	public String cut() {
		return "cut tomato sauce pizza...";
	}

	@Override
	public String box() {
		return "boxing tomato sauce pizza...";
	}

}
