public class Problem7 {
	public static void main(String[] args){
		int count = 0,finalNum = 0;
			for( int currentNum = 2; count < 10001 ; currentNum++ ){
				boolean testPrime = true;
				int y = (int) Math.sqrt(currentNum) + 1; // reduce numbers in the calculation
				for (int z = 2; z < y; z++ ){
					if (currentNum % z == 0){
						testPrime = false;
						break;
					}
				}
				if (testPrime == true){ // determine if the number is prime
					finalNum = currentNum; // get the last number and fix for loop add one to the end
					count++; // count the current term 
				}
			}
			System.out.println(finalNum);
	}
}
