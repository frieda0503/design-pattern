package factory_implement_answer;

/**
 * 工廠模式demo
 * 
 * @author Frieda
 *
 */
public class FactoryMain {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		
		nyStore.orderPizza("cheese");
	}
}
