public class Problem10 {
	public static void main(String[] args){
		int control = 2000000, x = 0;
		long sum = 0;
		for (x = 2; x < control ; x++){
			if (primeTest(x) == true){
				sum += x;
			}
		}
		System.out.println(sum);
	}
	public static boolean primeTest(int number){
		int reduce = (int) Math.sqrt(number) + 1;
		for (int a = 2 ; a < reduce ; a++){
			if (number % a == 0){
				return false;
			}
		}
		return true;
	}
}
