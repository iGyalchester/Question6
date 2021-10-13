package Assignment;

public class HourlyEmployee extends Employee implements Discountable{
	private static final double DISCOUNT = 0.10;

	public HourlyEmployee(String name, Size size) {
		super(name, size);
	}

	public HourlyEmployee(Size size) {
		super(size);
	}

	public HourlyEmployee(String name) {
		super(name);
	}

	@Override
	public double calculateDiscount(Clothing clothing) {
		return clothing.getPrice() - (clothing.getPrice() * DISCOUNT);
	}

}
