package Assignment;

public abstract class Employee extends Customer{
	private static final double DISCOUNT = 0.10;

	public Employee(String name, Size size) {

		super(name, size);

	}

	public Employee(Size size) {
		super(size);
	}

	public Employee(String name) {

	}


	public void printEmplyeePriceAfterDiscount(Clothing clothing) {

		System.out.println((clothing.getPrice() * DISCOUNT) + clothing.getPrice());

	}
}
