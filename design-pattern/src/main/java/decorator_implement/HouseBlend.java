package decorator_implement;

/**
 * 星巴茲(裝飾模式)
 * 
 * @author Frieda
 *
 */
public class HouseBlend extends Beverage {

	// description繼承自Beverage
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public int cost() {
		return 60;
	}

}
