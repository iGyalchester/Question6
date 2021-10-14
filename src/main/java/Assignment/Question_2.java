package Assignment;

public class Question_2 {
	public static void main(String[] args) {
		int[] numArray = {10, 3, 4, 67};

		System.out.println(secondAndThirdPlusAddAndMiltiplyByFirst(numArray));
	}

	public static int secondAndThirdPlusAddAndMiltiplyByFirst(int[] num) {
		int num1 = 0;
		int num2 = 0;
		for (int i : num){
			num1 = num[1];
			num2 = num[2];
		}
		return (num1 + num2) * num[0];

	}
}
