package abstract_factory_answer;

/**
 * 
 * @author Frieda
 *
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new TomatoSauce();
	}

}
