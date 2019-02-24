package simple_factory_implement;

/**
 * 工廠模式demo
 * 
 * @author Frieda
 *
 */
public class FactoryMain {
	public static void main(String[] args) {
		PizzaStore store = new PizzaStore();
		
		store.orderPizza("cheese");
		}
}
