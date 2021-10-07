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

}
