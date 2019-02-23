package decorator_implement;

/**
 * CondimentDecorator要能夠取代Beverage(透過繼承)
 * 
 * @author Frieda
 *
 */
public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();

}
