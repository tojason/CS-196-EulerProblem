import java.util.Scanner;


public class Problem17 {
	public static int count = 0;
	public static void main(String[] args){
		int one = 3;
		int two = 3;
		int three = 5;
		int four = 4;
		int five = 4;
		int six = 6;
		int seven = 5;
		int eight = 5;
		int nine = 4;
		int ten = 3;
		int hundred = 7;
		
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int currentNum =  sc.nextInt();
		
		if (currentNum > 9){
//			getSingle(currentNum);
			System.out.println(getSingle(currentNum));
			
		}
		for (int x = 1; x<= 5; x++){
			if (x == 1){
				count += one;
			}else if (x == 2){
				count += two;
			}else if (x == 3){
				count += three;
			}else if (x == 4){
				count += four;
			}else if (x == 5){
				count += five;
			}else if (x == 6){
				count += six;
			}else if (x == 7){
				count += seven;
			}else if (x == 8){
				count += eight;
			}else if (x == 9){
				count += nine;
			}else if (x == 10){
				count += ten;
			}
			
		}
		System.out.println(count);
	}
	
	public static int getNumContainUnderNN(int num){
		
		return 0;
	}
	
	static int getSingle(int num){
		int single = num % 10;
		return single;
		
	}
}
