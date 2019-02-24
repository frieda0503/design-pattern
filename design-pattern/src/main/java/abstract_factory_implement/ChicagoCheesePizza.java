package abstract_factory_implement;

/**
 * 建立物件實做方法
 * 
 * @author Frieda
 *
 */
public class ChicagoCheesePizza extends Pizza {
	public ChicagoCheesePizza() {
		name = "Chicago Style Sauce and Cheese Pizza";
		dough = "Extra Thin Crust Dough";
		sauce = "Plum Tomato Sauce";

		toppings.add("Mozzarella Cheese");
	}

	@Override
	public void cut() {
		System.out.println("Cutting pizza into square slices");
	}

}
