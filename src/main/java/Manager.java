public class Manager extends Employee implements Discountable{

	public Manager(String name, Size size) {
		super(name, size);
	}

	@Override
	public double calculateDiscount() {
		return 0;
	}
}
