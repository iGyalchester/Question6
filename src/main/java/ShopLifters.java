public class ShopLifters extends Person implements Discountable{

	public ShopLifters(String name) {
		super(name);
	}

	@Override
	public double calculateDiscount() {
		return 0;
	}
}
