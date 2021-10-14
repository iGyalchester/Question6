package Assignment;

import java.util.*;

public class MainApp {

	public static void main(String[] args) {

		Clothing[] clothing = new Clothing[3];
		Clothing jeans = new Clothing("Blue Jeans", 20.0, Size.M);
		Clothing tShirt = new Clothing("White T Shirt", 5.0, Size.S);
		Clothing buttonUp = new Clothing("Button Up Shirt", 30.0, Size.L);

		Clothing[] managerCart = new Clothing[3];
		managerCart[0] = jeans;
		managerCart[1] = tShirt;
		managerCart[2] = buttonUp;

		Manager manager = new Manager(Size.S);
		manager.setName("Ruby");

		Clothing[] hourlyEmployeeCart = new Clothing[3];
		hourlyEmployeeCart[0] = jeans;
		hourlyEmployeeCart[1] = tShirt;
		hourlyEmployeeCart[2] = buttonUp;

		HourlyEmployee hourlyEmployee = new HourlyEmployee(Size.L);
		hourlyEmployee.setName("Johnny");

		System.out.println("===============Total of manager's cart===============");
		System.out.println(Shop.calculateTotal(managerCart));

		System.out.println("===============Check if the jeans fits the hourly Employee===============");
		System.out.println(Shop.isAFit(hourlyEmployee, jeans));

		System.out.println("===============hourlyEmployee's price after discounts===============");
		System.out.println(hourlyEmployee.calculateDiscount(tShirt));

		System.out.println("===============manager's price after discounts===============");
		System.out.println(manager.calculateDiscount(tShirt));


		Clothing[] studentCart = new Clothing[3];
		studentCart[0] = jeans;
		studentCart[1] = tShirt;
		studentCart[2] = buttonUp;

		Student student = new Student(001L, Size.M);
		student.setName("Edward");

		System.out.println("===============Print Just the student's discount===============");
		System.out.println(student.calculateDiscount(tShirt));

		System.out.println("===============Invoke the printCustomerName===============");
		Shop.printCustomerName(manager);
		Shop.printCustomerName(hourlyEmployee);
		Shop.printCustomerName(student);

		System.out.println("==============================");
		System.out.println(tShirt);
		System.out.println(jeans);
		System.out.println(buttonUp);

		ArrayList<Clothing> arraylist = new ArrayList<>();
		arraylist.add(jeans);
		arraylist.add(tShirt);
		arraylist.add(buttonUp);

		System.out.println("===============sortAndPrintClothingItemsByPrice===============");
		Comparator<Clothing> compare = new CompareByPrice();
		arraylist.sort(compare);
		Shop.sortAndPrintClothingItemsByPrice(arraylist);


		Discountable[] discountable = new Discountable[4];
		Discountable shopLifters = new ShopLifters("Greg");
		discountable[0] = manager;
		discountable[1] = hourlyEmployee;
		discountable[2] = student;
		discountable[3] = shopLifters;

		System.out.println("===============Invoke the printDiscountAmountOff method===============");
		Shop.printDiscountAmountOff(discountable, buttonUp);
	}

}
