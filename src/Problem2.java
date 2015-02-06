public class Problem2 {
	public static void main(String[] args) {

		int a = 1; // set a initial starting value 'a'
		int b = 2; // set a initial starting value 'b'
		int sum = 0; // set a variable for sum with initial value = 0
		int temp = 0; // set a varible for temporary sum with initial value 0

		for (sum = 0; b < 4000000;) { // set range for a loop
			if (b % 2 == 0) { // check if the b is even number
				sum += b; // if yes, then add b to the sum
			}
			temp = a + b; // get a inital sum value
			a = b; // assign b to a
			b = temp; // assign temporary sum to b
			
			/** alternative method to solve
			 * using the patern even is every third number
			 */

			// int a = 1;
			// int b = 1;
			// int c = a + b;
			// int sum = 0;
			// while(c < 4000000){
			// sum += c;
			// a = b + c;
			// b = a + c;
			// c = a + b;

		}
		System.out.println(sum);
	}
}
