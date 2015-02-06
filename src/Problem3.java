public class Problem3 {
	public static void main(String[] args){
		long number = 600851475143L;
		int control = (int) Math.sqrt(number);
		int largestPrime = 0;
		while(number > 1){
			for (int x = 2 ; x < control ; x++){
				if( number % x == 0){
					number /= x;
					if ( x > largestPrime){
						largestPrime = x;
					}
					break;
				}
			}
		}
		System.out.println("The largest prime factor is "+largestPrime);
	}
}

