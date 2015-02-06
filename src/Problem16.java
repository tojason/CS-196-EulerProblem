import java.math.BigInteger;

public class Problem16 {
	public static void main(String[] args){
		
		BigInteger two = new BigInteger("2");
		for ( int x = 1; x < 1000; x++){
			two = two.multiply(BigInteger.valueOf(2));
		}
		System.out.println("The number of 2 ^ 1000 : "+two);
		int position1 = 0, position2, totalSum = 0;
		String getString = new String(two.toString());
		while(position1 != getString.length()){
			position2 = position1 + 1 ;
			int x = Integer.parseInt(getString.substring(position1, position2));
			totalSum += x;
			position1 ++;
		}
		System.out.println("The total sum of the digits is "+totalSum);
	}

}
