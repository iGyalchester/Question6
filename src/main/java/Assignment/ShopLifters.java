package Assignment;

public class ShopLifters extends Person implements Discountable{

	public ShopLifters(String name) {
		super(name);
	}

	@Override
	public double calculateDiscount(Clothing clothing) {
		return 0;
	}
}
