public class Student extends Customer implements Discountable{
	private long studentID;
	private final double DISCOUNT = 0.5;

	public Student(String name) {
		super(name);
	}

	@Override
	public double calculateDiscount() {
		return 0;
	}
}
