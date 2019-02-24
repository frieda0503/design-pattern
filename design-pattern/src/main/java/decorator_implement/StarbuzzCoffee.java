package decorator_implement;

/**
 * 星巴茲(裝飾模式)
 * 
 * @author Frieda
 *
 */
public class StarbuzzCoffee {
	public static void main(String[] args) {
		Beverage espresso = new Espresso();

		// 簡單的Espresso
		System.out.println(espresso.getDescription() + "$:" + espresso.cost());

		// 加料的Espresso
		Beverage espresso2 = new Espresso();
		espresso2 = new Milk(espresso2);
		espresso2 = new Chocolate(espresso2);

		// 加料的Espresso
		System.out.println(espresso2.getDescription() + "$:" + espresso2.cost());
	}

}
