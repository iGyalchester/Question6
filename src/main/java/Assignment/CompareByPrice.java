package Assignment;

import java.util.Comparator;

public class CompareByPrice implements Comparator<Clothing> {


	@Override
	public int compare(Clothing x, Clothing y) {
		if (x.getPrice() > y.getPrice()){
			return 1;
		}else
			return -1;
	}

}
