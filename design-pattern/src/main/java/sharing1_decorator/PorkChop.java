package sharing1_decorator;

/**
 * 裝飾者物件實作-配料(裝飾模式)<br>
 * 豬排
 * 
 * @author Frieda
 *
 */
public class PorkChop extends IngredientDecorator {
	Noodle noodle;

	public PorkChop(Noodle noodle) {
		super(noodle);
		description = "Pork Chop ";
		cost = 20;
		price = 55;
	}
}