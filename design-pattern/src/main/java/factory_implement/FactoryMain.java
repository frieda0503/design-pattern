package factory_implement;

/**
 * 工廠模式demo
 * 
 * @author Frieda
 *
 */
public class FactoryMain {
	public static void main(String[] args) {
		NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
		PizzaStore store = new PizzaStore(nyPizzaFactory);
		
		store.orderPizza("cheese");
	}
}
