package sharing1_decorator;

/**
 * 豬排豚骨拉麵(未使用裝飾模式)
 * 
 * @author Frieda
 *
 */
public class PorkChopSpareRibUdon extends Noodle {

	public PorkChopSpareRibUdon() {
		description = "PorkChopUdon ";
		cost = 50;
		price = 90;
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
