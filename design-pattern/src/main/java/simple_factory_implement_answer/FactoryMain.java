package simple_factory_implement_answer;

/**
 * 工廠模式demo
 * 
 * @author Frieda
 *
 */
public class FactoryMain {
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		
		store.orderPizza("cheese");
		}
}
