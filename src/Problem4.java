class Problem4 {
	public static void main (String[] args){
		
		int x , y;
		int finalx, finaly;
		int numFinal = 0;
		finalx = 0;
		finaly = 0;
		x = 0;
		y = 0;
		
		for (x = 100; x < 1000 ; x++){
			for (y = 100; y < 1000; y++){
				if (testPalindrome ( x * y ) && true ){
					if( numFinal < x * y){
						numFinal = x * y;
						do{
							finalx = x;
							finaly = y;
						}while(x > finalx | y > finaly);
					}
				}
			}
		}
		System.out.println("The largest palindrome number is " +numFinal);
		System.out.println(finalx + " and " + finaly);
	}
	
	public static boolean testPalindrome(int number) {
        int temp = number; 
        int reverseNumber = 0;

        while (temp != 0) {
            int remainder = temp % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            temp /= 10;
        }
        if (number == reverseNumber) {
            return true;
        }
        return false;
    }
}
