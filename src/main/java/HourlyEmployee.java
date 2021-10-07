public class HourlyEmployee extends Employee implements Discountable{

	public HourlyEmployee(String name, Size size) {
		super(name, size);
	}

	@Override
	public double calculateDiscount() {
		return 0;
	}
}
