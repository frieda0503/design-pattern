package sharing1_decorator;

/**
 * 豚骨拉麵(base)
 * 
 * @author Frieda
 *
 */
public class SpareRibUdon extends Noodle {

	public SpareRibUdon() {
		description = "SpareRib Udon ";
		cost = 30;
		price = 60;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public int getCost() {
		return cost;
	}

	@Override
	public int getPrice() {
		return price;
	}

}
