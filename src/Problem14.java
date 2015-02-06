public class Problem14 {
	public static void main(String[] args) {
		int count = 0;
		long temp = 1;
		long numFinal = 0;
		int num = 13;
		int storeCount = 0;
		while (num < 1000000) {
			temp = num;
			count = 0;
//			for (int x = 0; x < num;) {
			while(temp != 1){
				if (temp % 2 == 0) {
					temp = temp / 2;
					count++;
				} 

				else {
					temp = (3 * temp) + 1;
					count++;
				}
			}
			if (count > storeCount){
				storeCount = count;
				numFinal = num;
			}
			num ++;
		}
			System.out.println("The highest count is "+ storeCount);
			System.out.println("The final num is "+numFinal);
		
	}
}
