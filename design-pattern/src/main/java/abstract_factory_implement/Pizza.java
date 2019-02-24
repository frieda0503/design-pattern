package abstract_factory_implement;

import java.util.ArrayList;

/**
 * 定義pizza<br>
 * 
 * @author Frieda
 *
 */
public abstract class Pizza {
	// 名稱
	String name;

	// 麵糰
	String dough;

	// 醬料
	String sauce;

	// 配料
	ArrayList<String> toppings = new ArrayList<>();

	// TODO:備料來源要統一，不讓各自的store亂更改才料品質
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings...");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println(toppings.get(i));
		}
	};

	public void bake() {
		System.out.println("Bake for 25 minutes");
	};

	public void cut() {
		System.out.println("Cutting the pizza into diagonal alices");
	};

	public void box() {
		System.out.println("Place pizza in box");
	}

	public String getName() {
		return name;
	};

}
