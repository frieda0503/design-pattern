package sharing1_decorator;

/**
 * 味噌拉麵(base)
 * 
 * @author Frieda
 *
 */
public class MisoUdon extends Noodle {

	public MisoUdon() {
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
