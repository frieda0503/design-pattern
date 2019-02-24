package abstract_factory_answer;

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
	Dough dough;

	// 醬料
	Sauce sauce;

	// 配料
	ArrayList<String> toppings = new ArrayList<>();

	// 製作方法抽出
	abstract void prepare();

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
