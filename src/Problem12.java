public class Problem12 {

	public static void main(String[] args) {
		int numDividsors = 0;
		long triangleNumber = 0;
		for (int x = 1; numDividsors < 501; x++) {
			triangleNumber += x;
			numDividsors = 0;
			for (int y = 1; y <= Math.sqrt(triangleNumber); y++) {	
				if (triangleNumber % y == 0) {
					numDividsors +=2;
				}
			}
		}
		System.out.println("The first triangle number over 500 dividsors ia "+ triangleNumber);
	}
}