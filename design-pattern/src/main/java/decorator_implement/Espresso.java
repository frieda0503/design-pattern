package decorator_implement;

/**
 * 星巴茲(裝飾模式)
 * 
 * @author Frieda
 *
 */
public class Espresso extends Beverage {

	// description繼承自Beverage
	public Espresso() {
		description = "Espresso ";
	}

	@Override
	public int cost() {
		return 80;
	}

}
