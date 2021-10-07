import java.util.ArrayList;

public class Shop {
	public static double calculateTotal(Clothing[] clothing){
		for (Clothing cloths : clothing){
			return cloths.getPrice();
		}
		return 0.0;
	}


	public static boolean isAFit(Customer customer,  Clothing clothing){
		return true;
	}

	public static void printCustomerName(Customer customer){

		System.out.println(customer.getName());

	}

	public static void printDiscountAmountOff(Discountable[] discountable, Clothing clothing){

		System.out.println();
	}

	public static void sortAndPrintClothingItemsByPrice(ArrayList<Clothing> clothing){
		System.out.println();
	}


}