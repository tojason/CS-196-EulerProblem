public class Problem5 {
	public static void main(String[] args) {
		int initial, control = 0;
		for (initial = 20; control < 20; initial += 20) {
			for (int x = 1; x <= 20; x++) {
				if (initial % x == 0) {
					control++;
					if (control == 20) {
						System.out
								.println("The smallest positive number that is evenly divisible by 1-20 is :"
										+ initial);
						break;
					}
				} else {
					control = 0;
					break;
				}
			}
		}

	}
}
