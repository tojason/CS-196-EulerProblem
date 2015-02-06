import java.math.BigInteger;

public class Problem20 {
	public static void main(String[] args){
		int numFactorial = 100;
		BigInteger products = BigInteger.ONE;
		for (int x =1 ; x<= numFactorial ; x++){
			products = products.multiply(BigInteger.valueOf(x));
		}
		String getString = new String(products.toString());
		
		int position1 = 0, sumTotal = 0; ;
		while(position1 != getString.length()){
			int position2 = position1 + 1;
			int getNum = Integer.parseInt(getString.substring(position1,position2));
			sumTotal += getNum;
			position1++;
		}
		
		
		System.out.println(products);
		System.out.println(sumTotal);
		
	}
}
