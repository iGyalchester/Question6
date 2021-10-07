public class Clothing {
	private String description;
	private double price;
	private Size size;

	public Clothing(String description, double price, Size size) {
		this.description = description;
		this.price = price;
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}


	public Size getSize() {
		return size;
	}


	@Override
	public String toString() {
		return "Clothing{" +
				"description='" + description + '\'' +
				", price=" + price +
				", size=" + size +
				'}';
	}
}
