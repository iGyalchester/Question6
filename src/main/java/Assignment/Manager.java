package Assignment;

public class Manager extends Employee implements Discountable{

	private static final double DISCOUNT = 0.15;

	public Manager(Size size) {
		super(size);
	}


	@Override
	public double calculateDiscount(Clothing clothing) {

		return clothing.getPrice() - (clothing.getPrice() * DISCOUNT);
	}
}
