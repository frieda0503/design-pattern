package abstract_factory_answer;

/**
 * 工廠模式demo
 * 
 * @author Frieda
 *
 */
public class FactoryMain {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("order: " + pizza.getName() + " and sauce is " + pizza.sauce);
	}
}
