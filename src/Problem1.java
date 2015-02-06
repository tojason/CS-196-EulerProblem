
public class Problem1 {

	public static void main(String[] args) {
		int number = 1; // 
		int sum = 0;
		for(int x = 0; number <= 1000; x++){
			if ( x % 5 == 0 || x % 3 == 0){
				sum = sum + x;
			}
			number++;
		}
		System.out.println(sum);
	}

}
