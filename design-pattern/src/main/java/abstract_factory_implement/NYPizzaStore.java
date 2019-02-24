package abstract_factory_implement;

/**
 * 
 * @author Frieda
 *
 */
public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		// 建立NY風味的起士披薩
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
