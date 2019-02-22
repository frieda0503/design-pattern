package sharing4_abstract_factory;

/**
 * 週年慶
 * 
 * @author frieda
 *
 */
public abstract class AnniversaryFactory {
	abstract int getDiscount(int total);

	abstract int getCoupon(int total);
}
