package simple_factory_implement;

/**
 * 
 * @author Frieda
 *
 */
public class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = null;

		// TODO:將會改變的地方抽出去
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("tomato")) {
			pizza = new TomatoSaucePizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
