import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {

	public static void main(String[] args) {

		Clothing[] managerCart = new Clothing[3];
		Clothing jeans = new Clothing("Blue Jeans", 20.0, Size.M);
		Clothing tShirt = new Clothing("White T Shirt", 5.0,Size.S);
		Clothing buttonUp = new Clothing("Button Up Shirt", 30.0, Size.L);

		managerCart[0] = jeans;
		managerCart[1] = tShirt;
		managerCart[2] = buttonUp;

		Manager manager = new Manager("Rubby", Size.S);

		Clothing[] hourlyEmployeeCart = new Clothing[3];
		hourlyEmployeeCart[0] = jeans;
		hourlyEmployeeCart[1] = tShirt;
		hourlyEmployeeCart[2] = buttonUp;

		HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane", Size.M);


	}













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
