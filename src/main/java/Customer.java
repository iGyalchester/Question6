import java.util.Arrays;

public abstract class Customer extends Person{
	private Clothing[] clothingItems;
	private Size size;

	public Customer(String name) {
		super(name);
	}

	public Customer(String name, Size size) {
		super(name);
	}
	@Override
	public String toString() {
		return "Customer{" +
				"clothingItems=" + Arrays.toString(clothingItems) +
				", size=" + size +
				'}';
	}
}
