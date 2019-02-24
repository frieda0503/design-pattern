package factory_implement;

/**
 * 
 * @author Frieda
 *
 */
public class NYPizzaFactory extends SimplePizzaFactory {
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (type.equals("tomato")) {
			pizza = new TomatoSaucePizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}

		return pizza;
	}
}
