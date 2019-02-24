package simple_factory_implement_answer;

/**
 * 
 * @author Frieda
 *
 */
public class PizzaStore {
	// 加入工廠
	SimplePizzaFactory factory;

	// 工廠做為參數
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = null;

		// 透過傳入type的方式使用工廠製作pizza
		pizza = factory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
