package abstract_factory_implement;

/**
 * 
 * @author Frieda
 *
 */
public abstract class PizzaStore {

	// 點餐
	public Pizza orderPizza(String type) {
		Pizza pizza = null;

		// createPizza的方法我們又搬回來store裡面，製作pizza
		pizza = createPizza(type);

		// 全部店家都有的流程
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
	
	// 讓各store有自己製作pizza的方式
	abstract Pizza createPizza(String type);

}
