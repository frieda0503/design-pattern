package abstract_factory_answer;

/**
 * 建立物件實做方法
 * 
 * @author Frieda
 *
 */
public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
		name = "Cheese Pizza";
		
		System.out.println("Preparing " + name);
		// 備料的原料從工廠拿
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
	}
}
