public class Problem5_fast {

	public static void main(String[] args) {

		int startingValue = 0;

		for (startingValue = +20;startingValue != 0 ; startingValue += 20) {
			if (startingValue % 1 == 0 &&
					startingValue % 2 == 0 &&
					startingValue % 3 == 0 &&
					startingValue % 4 == 0 &&
					startingValue % 5 == 0 &&
					startingValue % 6 == 0 &&
					startingValue % 7 == 0 &&
					startingValue % 8 == 0 &&
					startingValue % 9 == 0 &&
					startingValue % 10 == 0 &&
					startingValue % 11 == 0 &&
					startingValue % 12 == 0 &&
					startingValue % 13 == 0 &&
					startingValue % 14 == 0 &&
					startingValue % 15 == 0 &&
					startingValue % 16 == 0 &&
					startingValue % 17 == 0 &&
					startingValue % 18 == 0 &&
					startingValue % 19 == 0 &&
					startingValue % 20 == 0 
					) {
				System.out.println("The samllest postive number is evenly divide by 1-20 is : " + startingValue);
				break;
			}
		}
	}
}
