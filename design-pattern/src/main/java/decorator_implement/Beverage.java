package decorator_implement;

/**
 * 星巴茲(裝飾模式)
 * 
 * @author Frieda
 *
 */
public abstract class Beverage {

	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	};

	public abstract int cost();
}
