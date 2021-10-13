package Assignment;

import java.util.Arrays;

public abstract class Customer extends Person {
	private Clothing[] clothingItems;
	private Size size;

	public Customer(String name, Size size) {
		super(name);
	}

	public Customer(Size size){
		super();
		this.size = size;

	}

	public Customer() {

	}

	public Clothing[] getClothingItems() {
		return clothingItems;
	}

	public Size getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"clothingItems=" + Arrays.toString(clothingItems) +
				", size=" + size +
				'}';
	}
}
