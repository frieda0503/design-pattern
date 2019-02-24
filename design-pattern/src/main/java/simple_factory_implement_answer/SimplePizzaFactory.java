package simple_factory_implement_answer;

/**
 * 
 * @author Frieda
 *
 */
public class SimplePizzaFactory {

	// 所有的客戶會利用這個方法去new出一個物件
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("tomato")) {
			pizza = new TomatoSaucePizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}

}
