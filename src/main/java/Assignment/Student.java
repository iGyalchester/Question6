package Assignment;

public class Student extends Customer implements Discountable{
	private long studentID;
	private static final double DISCOUNT = 0.5;

	public Student(String name, long studentID, Size size) {
		super(name, size);
	}

	public Student(long studentID,Size size) {

	}

	@Override
	public double calculateDiscount(Clothing clothing) {

		return clothing.getPrice() - (clothing.getPrice() * DISCOUNT);
	}
}
