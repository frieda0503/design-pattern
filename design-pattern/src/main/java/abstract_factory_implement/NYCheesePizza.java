package abstract_factory_implement;

/**
 * 建立物件實做方法
 * 
 * @author Frieda
 *
 */
public class NYCheesePizza extends Pizza {
	public NYCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}

}
