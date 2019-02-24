package abstract_factory_answer;

/**
 * 
 * @author Frieda
 *
 */
public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

		// 建立NY風味的起士披薩
		if (type.equals("cheese")) {
			pizza = new CheesePizza(pizzaIngredientFactory);
		}

		return pizza;
	}

}
