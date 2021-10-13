package Assignment;

import java.util.ArrayList;

public class Shop {
	public static double calculateTotal(Clothing[] clothing) {
		double total = 0.0;
		for (Clothing clotes : clothing) {
			total += clotes.getPrice();

		}
		return total;
	}

	public static boolean isAFit(Customer customer, Clothing clothing) {
		return customer.getSize() == clothing.getSize();
	}

	public static void printCustomerName(Customer customer) {
		System.out.println(customer.getName());
	}

	public static void printDiscountAmountOff(Discountable[] discountable, Clothing clothing) {
		for (Discountable discountables : discountable) {
			System.out.println(discountables.calculateDiscount(clothing));
		}

	}

	public static void sortAndPrintClothingItemsByPrice(ArrayList<Clothing> clothing) {
		for (Clothing clothes : clothing) {
			System.out.println(clothes.getPrice());
		}

	}
}
